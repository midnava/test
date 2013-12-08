package Lesson5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Пользователь вводит имя файла.  файл должен содержать числа разделенные пробелом, посчитать сумму этих чисел. next.int()
 */
public class Task6 {
    public static void main(String[] args) throws IOException {
        String file = writer();
        String inFile = reader(file);
        convertor(inFile);


    }

    public static String writer() throws IOException {
        System.out.print("Создайте файл, введите его имя: ");
        String file = scaner();
        System.out.print("Заполните файл цифрами через пробел: ");
        FileWriter writer = new FileWriter(file);
        writer.write(scaner());
        writer.flush();
        writer.close();
        return file;

    }

    public static String scaner() {
        Scanner scan = new Scanner(System.in);
        String fileVal = scan.nextLine();
        return fileVal;
    }

    public static String reader(String file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);
        Scanner scan = new Scanner(reader);
        String str = scan.nextLine();
        return str;


    }

    public static void convertor(String inFile) {
        char[] a = inFile.toCharArray();
        char[] b = new char[a.length / 2 + 1];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                k++;

            } else {
                b[k] = a[i];
            }

        }
        fromCharToInt(b);
    }

    public static void fromCharToInt(char[] b) {
        int[] arr = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            arr[i] = Integer.valueOf(b[i]);

        }
        convertorFromAscii(arr);

    }

    public static void convertorFromAscii(int[] arr) {
        int[] array = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                k++;
            } else {
                array[k] += arr[i] - 48;
            }

        }
        sum(array);

    }

    public static void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("Сумма цифр в строке файла >>" + sum);
    }

}



