package Lesson5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3.Пользователь вводит имя фала в котором одна строчка. перевернуть строку в файле.
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        String fileName = file();
        reverse(fileName);
        char[] reversed = reverse(fileName);
        System.out.println(reversed);
        reversewrite(reversed, fileName);

    }


    public static String file() throws IOException {
        String fileName = scan();
        FileWriter writer = new FileWriter(fileName);
        writer.write("Строка для разворота");
        writer.flush();
        return fileName;
    }

    public static String scan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String name = scan.nextLine();
        return name;
    }

    public static char[] reverse(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        Scanner scan = new Scanner(reader);
        fileName = scan.nextLine();
        reader.close();
        char[] a = fileName.toCharArray();
        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];


        }
        return b;


    }
       public static void reversewrite(char[] b, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(b);
        writer.flush();

    }


}
