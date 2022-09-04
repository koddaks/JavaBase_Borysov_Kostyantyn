package com.hillel.borysov.lessons.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\VsemPC\\Desktop\\FileToCopy.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Обучение\\FileToCopyFoder\\result.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
