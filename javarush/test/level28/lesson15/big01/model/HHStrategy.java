package com.javarush.test.level28.lesson15.big01.model;


import com.javarush.test.level28.lesson15.big01.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HHStrategy implements Strategy
{
    private static final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";

    @Override
    public List<Vacancy> getVacancies(String searchString)
    {
       List<Vacancy> list = new ArrayList<>();
        Document doc = null;
        int i = 0;
        while (true)
        {
            try {
                doc = getDocument("kiev",i++);
            } catch (IOException e) {
            }
            Elements all = doc.select("div.search-result-item");
            if (all.size() > 0) {
                for (Element e : all) {
                    Vacancy vac = new Vacancy();
                    vac.setUrl(e.select("a.search-result-item__name").attr("href"));
                    vac.setTitle(e.select("a.search-result-item__name").text());
                    vac.setSalary(e.select("div.b-vacancy-list-salary").text());
                    vac.setCity(e.select("span.searchresult__address").text());
                    vac.setCompanyName(e.select("a.link-secondary").text());
                    vac.setSiteName("hh");
                    list.add(vac);
                }
            } else {
                break;
            }
        }
        return list;

    }

    protected Document getDocument(String searchString, int page) throws IOException {
        String url = String.format(URL_FORMAT,searchString, page);
        Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (jsoup)").referrer("some text").timeout(5000).get();
        return doc;
    }

}


