package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Пользователь вводит своё имя попреветствовать пользователя по имени
        // Пользователь вводит свой возраст, вывести на екран количество лет жизни которое ему осталось жить.

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String imya = scan.nextLine();      // считываем строку введенную с клавиатуры
        System.out.println("Привет " + imya);
        System.out.println("Сколько Вам лет? ");
        int vozrast = scan.nextInt();         // считываем числа введенные с клавиатуры
        int etalon = 80 - vozrast;
        System.out.println("Вам осталось жить: " + etalon);
    }
}