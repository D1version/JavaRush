package com.javarush.test.level28.lesson15.big01.model;


import com.javarush.test.level28.lesson15.big01.vo.Vacancy;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinkedInStrategy implements Strategy
{
    private static final String URL_FORMAT = "https://www.linkedin.com/job/java-jobs-%s/?page_num=%d";

    protected Document getDocument(String searchString, int page) throws IOException
    {
        String url = "https://www.linkedin.com/uas/login?goback=&trk=hb_signin";
        Connection.Response response = Jsoup
                .connect(url)
                .method(Connection.Method.GET)
                .timeout(10000)
                .execute();

        Document responseDocument = response.parse();
        Element loginCsrfParam = responseDocument
                .select("input[name=loginCsrfParam]")
                .first();

        response = Jsoup.connect(String.format(URL_FORMAT, searchString, page))
                .cookies(response.cookies())
                .data("loginCsrfParam", loginCsrfParam.attr("value"))
                .data("session_key", "YOUR_LOGIN")
                .data("session_password", "YOUR-PASSWORD")
                .method(Connection.Method.POST)
                .followRedirects(true)
                .execute();

        return response.parse();
    }

    @Override
    public List<Vacancy> getVacancies(String searchString)
    {
        List<Vacancy> vacanciesList = new ArrayList<>();
        int page = 0;
        while (true) {
            try {
                Document doc = getDocument(searchString, page);
                Elements vacanciesElementses = doc.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy");
                if (vacanciesElementses.size() == 0) break;
                for (Element element : vacanciesElementses) {
                    Vacancy vacancy = new Vacancy();
                    vacancy.setTitle(element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-title").text());
                    vacancy.setCompanyName(element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-employer").text());
                    vacancy.setCity(element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-address").text());
                    vacancy.setSiteName(doc.title());
                    vacancy.setUrl(element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-title").attr("href"));
                    vacancy.setSalary(element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-compensation").text());
                    vacanciesList.add(vacancy);
                }
                page++;
            } catch (IOException e) {
            }
        }
        return vacanciesList;
    }
}
