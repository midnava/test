package Lesson4;
import  java.util.Scanner;

/**
 Пользователь вводит строку расположить символы строки в обратном порядке.*
 */
public class Task8 {
    public static void  main(String[] args){


        String str = readLine();

        reverseByArray(str);
        System.out.print(str);

    }
    public static String readLine(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.nextLine();
        return str;


    }

    public static String reverseByArray(String str) {
        char[] a = str.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return str;
    }
}