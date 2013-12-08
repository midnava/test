package lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Пользователь вводит 2 числа, вывести на екран большее из них.
        // Сделать проверку на коректность вводимых данных.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите первое число: ");
        int chislo1;
        int chislo2;
        if (scan.hasNextInt()) {
            chislo1 = scan.nextInt();

        } else {
            String a = scan.next();
            System.out.println("Вы ввели " + a + " Попробуйте еще раз");
            return;


        }
        System.out.println("Ведите второе число: ");
        if (scan.hasNextInt()) {
            chislo2 = scan.nextInt();
        } else {
            String b = scan.next();
            System.out.println("Вы ввели " + b + " Попробуйте еще раз");
            return;


        }

        if (chislo1 > chislo2) {
            System.out.println("Большее число " +chislo1);

        } else {
            System.out.println("Большее число " + chislo2);


        }
    }
}





