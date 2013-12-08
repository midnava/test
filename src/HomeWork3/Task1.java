package HomeWork3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. Пользователь вводит имя файла со строками.
 * Изменить первую букву каждого слова на большую.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        String file = scaner();
        writer(file);
    }

    public static void writer(String file) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write("джигурда иван пантелеймонович первый");
        //writer.write("иван" + '\f');
        //writer.write("пантелеймонович");
        writer.flush();
        writer.close();
        reader(file);

    }

    public static String scaner() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String str = scan.nextLine();
        return str;
    }

    public static void reader(String file) throws IOException {
        FileReader reader = new FileReader(file);
        Scanner scan = new Scanner(reader);
        String str = scan.nextLine();
        reader.close();
        convert(str);

    }

    public static void convert(String str) {
        char[] a = str.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];

        }
        upper(b);

    }

    public static void upper(char[] b) {
        int k = 0;
        b[0] = Character.toUpperCase(b[0]);
        for (int i = 0; i < b.length; i++) {
            if (b[i] == ' ') {
                k = i+1;
                b[k] = Character.toUpperCase(b[i+1]);
            } else {
                k =0;

            }

        }
        System.out.println(b);

    }
}
