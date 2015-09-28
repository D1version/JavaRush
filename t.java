package Scrambler;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;


public class Scrambler {
    public static void main(String args[]) throws FileNotFoundException {
        if(args.length != 0) {
            try {
                String fileInputName = args[1];
                String fileOutputName = args[2];
                if (args[0].equalsIgnoreCase("-e")) {
                    encryption(fileInputName, fileOutputName);
                } else if (args[0].equalsIgnoreCase("-d")) {
                    decryption(fileInputName, fileOutputName);
                } else throw new FileNotFoundException();
            } catch (Exception e) {
                System.out.println("Error!");
                e.printStackTrace();
            }
        }

    }
    public static void encryption(String fileInput, String fileOutput) throws IOException {
        try(FileInputStream fileReader= new FileInputStream(new File(fileInput));
            FileOutputStream fileWriter = new FileOutputStream(new File(fileOutput)))
        {
            while(fileReader.available() > 0)
            {
                int s = fileReader.read();
                s+=35;
                fileWriter.write(s);
            }
        }

    }

    public static void decryption(String fileInput, String fileOutput) throws IOException {
        try(FileInputStream fileReader= new FileInputStream(new File(fileInput));
            FileOutputStream fileWriter = new FileOutputStream(new File(fileOutput)))
        {
            while(fileReader.available() > 0)
            {
                int s = fileReader.read();
                s-=35;
                fileWriter.write(s);
            }
        }

    }
}
