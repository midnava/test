package HomeWork3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 1. Пользователь вводит имя файла, заполненного строками.
 * Вывести на экран самое длинное слово из файла.
 */
public class Task0 {
    public static void main(String[] args) throws IOException {
        scaner();

    }

    public static void writer(String name) throws IOException {
        FileWriter writer = new FileWriter(name);
        writer.write("нечего было делать васяпупкин купил слона");
        writer.close();
        reader(name);


    }

    public static String scaner() throws IOException {
        System.out.print("Введите имя файла: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        writer(name);
        return name;

    }

    public static void reader(String name) throws IOException {
        FileReader reader = new FileReader(name);
        Scanner scan = new Scanner(reader);
        String str = scan.nextLine();
        reader.close();
        returnStr(str);

    }

    public static void returnStr(String str) {
        int tmpSum = 0;
        int resultSum = 0;
        int tmpIndex = 0;
        int resultIndex = 0;

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ' ') {
                if (resultSum <= tmpSum) {
                    resultSum = tmpSum;
                    resultIndex = tmpIndex;
                }
                tmpSum = 0;
                tmpIndex = 0;


            } else {
                if (i == 0 | tmpSum == 0) {
                    tmpIndex = i;
                    tmpSum++;
                } else {
                    tmpSum++;
                }


            }
        }
        for (int i = resultIndex; i < resultIndex + resultSum; i++){
            System.out.print(str.charAt(i));
        }


    }

}

