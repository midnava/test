package lesson2;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        // Пользователь  вводит длинну линии, нарисовать эту линию звёздочками.
        //Сделать проверку на коректность

        Scanner scan = new Scanner(System.in);

        int sklad = 0;
        int chislo;

        System.out.println("Введите длинну линии: ");
        if (scan.hasNextInt()) {
            chislo = scan.nextInt();
        } else {
            String a = scan.nextLine();
            System.out.println("Вы ввели " + a + " Попробуйте еще раз");
            return;
        }
        for (sklad = 0; sklad < chislo; sklad++) {
            System.out.print("*");


        }
    }
}