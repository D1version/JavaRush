package com.javarush.test.level18.lesson08.task03;

import java.io.*;
import java.nio.channels.FileChannel;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream {
    public static String fileName = "C:/1.txt";
    private FileOutputStream fos;

    public AmigoOutputStream(FileOutputStream fos){
        this.fos = fos;
    }

    public void write(int b) throws IOException
    {
        fos.write(b);
    }

    public FileChannel getChannel()
    {
        return fos.getChannel();
    }

    public void close() throws IOException
    {
        fos.flush();
        fos.write(new String("JavaRush © 2012-2013 All rights reserved.").getBytes());
        fos.close();
    }

    public void write(byte[] b, int off, int len) throws IOException
    {
        fos.write(b, off, len);
    }

    public void flush() throws IOException
    {
        fos.flush();
    }

    public void write(byte[] b) throws IOException
    {
        fos.write(b);
    }

    public FileDescriptor getFD() throws IOException
    {
        return fos.getFD();
    }

    public static void main(String[] args) throws IOException
    {
        AmigoOutputStream a = new AmigoOutputStream(new FileOutputStream(fileName));
        a.close();

    }
}