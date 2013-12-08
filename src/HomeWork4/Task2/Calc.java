package HomeWork4.Task2;

import java.util.Scanner;

/**
 * )Пишем калькулятор в виде консольного меню.
 * сложение  двух чисел
 * вычитание двух чисел
 * умножение двух чисел
 * деление   двух чисел
 * без ООП.
 */
public class Calc {
    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu() {
        System.out.println("сложение    - нажмите клавишу 1");
        System.out.println("вычетаниe   - нажмите клавишу 2");
        System.out.println("умножение   - нажмите клавишу 3");
        System.out.println("деление     - нажмите клавишу 4");
        chois();
    }

    public static void chois() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ваш выбор: ");
        int chois = 0;
        if (scan.hasNextInt()) {
            chois = scan.nextInt();
            if (chois < 1 | chois > 4) {
                System.out.println("Вы ввели не допустимое значение");
                mainMenu();
            }
        } else {
            String a = scan.nextLine();
            System.out.println("Вы ввели не допустимый символ >>" + a + "<< Попробуйте еще раз");
            mainMenu();
        }
        menu(chois);

    }

    public static void menu(int chois) {
        if (chois == 1) {
            plus();
        }
        if (chois == 2) {
            subtraction();
        }
        if (chois == 3) {
            multipli();
        }
        if (chois == 4) {
            div();
        }


    }

    public static int value() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число ");
        int val = 0;
        if (scan.hasNext()) {
            val = scan.nextInt();
        } else {
            String a = scan.nextLine();
            System.out.println("Вы ввели не допустимый символ >>" + a + "<< Попробуйте еще раз");
            mainMenu();
        }
        return val;
    }

    public static void plus() {
        System.out.println("Вы выбрали сложение, введите два числа");
        int val1 = value();
        int val2 = value();
        int res = val1 + val2;
        System.out.println("Результат сложения равен >>" + res + "<<");
    }

    public static void subtraction() {
        System.out.println("Вы выбрали вычетание, введите два числа");
        int val1 = value();
        int val2 = value();
        int res = val1 - val2;
        System.out.println("Результат вычетания равен >>" + res + "<<");

    }

    public static void multipli() {
        System.out.println("Вы выбрали умножение, введите два числа");
        int val1 = value();
        int val2 = value();
        int res = val1 * val2;
        System.out.println("Результат умножения равен >>" + res + "<<");


    }

    public static void div() {
        System.out.println("Вы выбрали деление, введите два числа");
        int val1 = value();
        int val2 = value();
        int res = val1 / val2;
        System.out.println("Результат деления равен >>" + res + "<<");
    }
}
