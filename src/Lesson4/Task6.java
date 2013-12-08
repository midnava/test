package Lesson4;

import java.util.Scanner;

/**
 Пользователь вводит строку, посчитать сколько символов A и вывести на екран.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любые символы: ");
        String str = scan.next();


        int sumOfelems = 0;
        for (int i = 0; i < str.length(); i++) {
            char elem = str.charAt(i);
            if (elem == 'a') {
                sumOfelems++;
            }
        }
        System.out.print(sumOfelems);


    }
}


