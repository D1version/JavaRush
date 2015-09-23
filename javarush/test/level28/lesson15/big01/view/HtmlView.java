package com.javarush.test.level28.lesson15.big01.view;


import com.javarush.test.level28.lesson15.big01.Controller;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class HtmlView implements View
{
    private final String filePath = "./src/" + this.getClass().getPackage().getName().replace(".", "/") + "/vacancies.html";


    Controller controller;
    @Override
    public void update(List<Vacancy> vacancies)
    {
        try {
            updateFile(getUpdatedFileContent(vacancies));
        } catch (Exception e) {
            System.out.println("Some exception occurred");
            e.printStackTrace();

        }
    }

    @Override
    public void setController(Controller controller)
    {
        this.controller=controller;
    }

    public void userCitySelectEmulationMethod()
    {
        controller.onCitySelect("Харьков");
    }

    protected Document getDocument() throws IOException {
        Document document = Jsoup.parse(new File(filePath), "UTF-8");
        return document;
    }


    private String getUpdatedFileContent(List<Vacancy> vacancies) throws IOException
    {
        Document document = null;

        document = getDocument();
        Element original = document.getElementsByClass("template").first();
        Element template = original.clone();

        template.removeClass("template").addClass("vacancy").removeAttr("style");

        document.getElementsByAttributeValue("class","vacancy").remove();

        for (Vacancy vacancy : vacancies) {
            Element vac = template.clone();
            vac.getElementsByAttributeValue("class", "city").get(0).text(vacancy.getCity());
            vac.getElementsByAttributeValue("class", "companyName").get(0).text(vacancy.getCompanyName());
            vac.getElementsByAttributeValue("class", "salary").get(0).text(vacancy.getSalary());
            vac.getElementsByAttribute("href").get(0).attr("href", vacancy.getUrl()).text(vacancy.getTitle());

            original.before(vac.outerHtml());
        }
        return document.html();

    }

    private void updateFile(String file) throws IOException
    {
        PrintWriter writer = new PrintWriter(new FileWriter(filePath));
        writer.print(file);
        if (writer != null) {
            writer.close();
        }

    }
}
