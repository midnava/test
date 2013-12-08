package Lesson5;
import java.io.FileReader;
import java.io.FileWriter;
import  java.util.Scanner;

/**
считываем строку из файла

 private static char[] readElFromLine(String lineFromDiscret, final String FILE_NAME) throws Exception {
 FileReader reader2 = new FileReader(FILE_NAME);
 char[] discretLineToElements = new char[lineFromDiscret.length()];

 for (int i=0; i < lineFromDiscret.length(); i++) {
 //reader2.read();            //-- читает 1 элемент в строе (и не озвращается!!)
 int el = reader2.read();   //-- читает "первый" элемент, и "сдвигается" на 1 вправо.
 char chEl = (char) el;      //-- переводит данный элемент в символ. Т.е., считаел первый символ.
 discretLineToElements[i] = chEl;
 }
 reader2.close();
 return discretLineToElements;
 }
 */
public class Task1 {
    public static void main(String[] args) throws Exception{
        final String FILE_NAME = "text.txt";
        FileReader reader = new FileReader(FILE_NAME);
        Scanner scan = new Scanner(reader);
        String line = scan.nextLine();
        //System.out.println(line);

        System.out.println("Read file");
        while (scan.hasNextLine()){
            line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
        FileWriter writer = new FileWriter(FILE_NAME);
        writer.write("To file" + '\n');
        writer.write("To file2" + '\n');
        writer.close();
        System.out.println(line);

    }
}
