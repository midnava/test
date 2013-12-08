package homeWork1;

import java.util.Scanner;
import java.lang.Math;

/**
 * Пользователь вводит 3 числа, определить найбольшее и найменьшее из них и вывести на екран.
 */
/*public class Home2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Заполните массив тремя числами: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];

        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
*/

public class Home2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1 -> ");
        int a = sc.nextInt();
        System.out.print("Введите число 2 -> ");
        int b = sc.nextInt();
        System.out.print("Введите число 3 -> ");
        int c = sc.nextInt();
        System.out.println("Вы ввели: " + a + ";" + b + ";" + c);

        if (a > b & a > c) {
            System.out.println("Большее число: " + a);
        } else if (b > a & b > c) {
            System.out.println("Большее число: " + b);
        } else if (c > a & c > b) {
            System.out.println("Большее число: " + c);
        }
        if (a < b & a < c) {
            System.out.println("Меньшее число: " + a);
        } else if (b < a & b < c) {
            System.out.println("Меньшее число: " + b);
        } else if (c < a & c < b) {
            System.out.println("Меньшее число: " + c);

        }
    }
}