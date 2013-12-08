package Lesson5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 .Пользователь вводит имя фала источника, затем им фала приемника, скопировать содержимое файла.
 */
public class Task3 {
    public static void main(String[] args) throws Exception{
        String fileName1 = fileWriter();
        String fileName2 = fileWriter2();
        fileCopy(fileName1,fileName2);

    }


    public static String fileWriter() throws IOException {
        System.out.print("Введите имя файла:");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        FileWriter writer = new FileWriter(fileName);
        writer.write("Вася" + '\n');
        writer.write("Петя" + '\n');
        writer.write("Федя" + '\n');
        writer.close();
        return fileName;
    }
    public static String fileWriter2() throws IOException {
        System.out.print("Введите имя файла2:");
        Scanner scan = new Scanner(System.in);
        String fileName2 = scan.nextLine();
        FileWriter writer = new FileWriter(fileName2);
        writer.close();
        return fileName2;


    }
    public static void fileCopy(String fileName1, String fileName2) throws Exception {
        FileReader read = new FileReader(fileName1);
        String str;
        Scanner scan = new Scanner(read);
        //Scanner scan2 = new Scanner(new FileReader(fileName2));
        FileWriter writer = new FileWriter(fileName2);

        int count = 0;
        while (scan.hasNextLine()){
            str = scan.nextLine();
            //fileName2 = writer.write();

            writer.write(str+ '\n' );
            writer.flush();
        }


        //System.out.println(count);
    }
}
