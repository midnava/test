package Lesson5;
import java.io.*;
import java.util.Scanner;

/**
Пользователь вводит имя файла, подсчитать количество строк в файле.
 2.Пользователь вводит имя фала источника, затем им фала приемника, скопировать содержимое файла.
 3.Пользователь вводит имя фала в котором одна строчка. перевернуть строку в файле.
 4.y = x; y = x(факториал)(n!=(n-1)!n); y =enx(логарифм)(Math.log); y= 3 в степени x(степенная функция); y = корень из X;
 y = x  в квадрате; y = x  в кубе.     5 шагов.
 5. Написать метод который вычисляет факториал.
 6. Пользователь вводит имя файла.  файл должен содержать числа разделенные пробелом, посчитать сумму этих чисел. next.int()
 */
public class Task2 {
    public static void main(String[] args) throws Exception{

        String fileName = fileWriter();
        fileReader(fileName);




    }
    public static String fileWriter() throws IOException {
        System.out.print("Введите имя файла:");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        FileWriter writer = new FileWriter(fileName);
        writer.write("kfasnksafn" + '\n');
        writer.write("kfasnksafn" + '\n');
        writer.write("kfasnksafn" + '\n');
        writer.close();
        return fileName;

    } public static void fileReader(String fileName) throws Exception {
           FileReader read = new FileReader(fileName);
           Scanner scan = new Scanner(read);
           //String  line = scan.nextLine();
        int count = 0;
           while (scan.hasNextLine()){
               fileName = scan.nextLine();
               count++;
               System.out.println(fileName);
           }

        System.out.println(count);
        }

    }



