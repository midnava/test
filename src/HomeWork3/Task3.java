package HomeWork3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 04. Пользователь водит имя текстового файла.
 * Заархивировать файл алгоритмом RLE.
 * <p/>
 * алгоритм RLE:
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        String fileName = scaner();
        writer(fileName);

    }

    public static String scaner() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scan.nextLine();
        return fileName;

    }

    public static void writer(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write("aabbbccccdw");
        writer.close();
        rle(fileName);

    }

    public static void rle(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        String archive = "archive.txt";
        FileWriter writer = new FileWriter(archive);
        Scanner scan = new Scanner(reader);

        String str = scan.next();
        int count = 1;
        int index = 0;
        char val = ' ';
        for (int i = 0; i < str.length()-1; i++) {
            index = i;
            val = str.charAt(i);
            if (val == str.charAt(i+1)) {
                count++;

                // writer.write(" " + count + val);
            }
            if (val != str.charAt(i+1)) {
                writer.write("" + count + val);
                count = 1;
                index = i;
            }
           /* for (int j = i; j < str.length(); j++) {
                if (val == str.charAt(j)) {
                    count++;
                    writer.write(" " + count + val);


                } else {
                    count = 0;
                    index = j;

                }

            }


       */
        }
        writer.close();
        reader.close();


    }


}

