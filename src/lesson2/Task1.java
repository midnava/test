package lesson2;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        // пользователь вводит 2 числа, вывести на екрна их сумму и квадрат.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int chislo1 = scan.nextInt();
        System.out.println("Введите число 2: ");
        int chislo2 = scan.nextInt();
        int c = chislo1 + chislo2;
        System.out.println(c);
        int b = chislo1 * chislo1;
        System.out.println(b);
        int g = chislo2 * chislo2;
        System.out.println(g);


    }
}