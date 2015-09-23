package com.javarush.test.level20.lesson02.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Читаем и пишем в файл: Human
Реализуйте логику записи в файл и чтения из файла для класса Human
Поле name в классе Human не может быть пустым
В файле your_file_name.tmp может быть несколько объектов Human
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File f = new File("D:\\1.txt");
            OutputStream outputStream = new FileOutputStream(f);
            InputStream inputStream = new FileInputStream(f);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            System.out.println(ivanov.name.equals(somePerson.name));
            System.out.println(ivanov.assets.get(0).getName().equals(somePerson.assets.get(0).getName()));
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            String isHumanPresent = assets !=null ? "yes" : "no";
            writer.println(isHumanPresent);
            int a = assets.size();
            writer.println(a);
            writer.println(name);
            if(a>0)
            {
                for (Asset as : assets){
                    writer.println(as.getName());
                    writer.println(as.getPrice());
                }
            }
            writer.flush();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String a = reader.readLine();
            if(a.equals("yes"))
            {
                int b = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                if (b > 0)
                {

                    assets = new ArrayList<>(b);

                    for (int i = 0; i < b; i++)
                    {
                        Asset as = new Asset(reader.readLine());
                        Double prise = Double.parseDouble(reader.readLine());
                        as.setPrice(prise);
                        assets.add(as);
                    }

                }
            }
            reader.close();


        }
    }
}
