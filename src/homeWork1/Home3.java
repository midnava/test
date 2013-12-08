package homeWork1;

import java.util.Scanner;

/**
 * Пользователь вводит массив с клавиатуры(вначале размер массива) потом заполняет массив значениями,
 * вывестина на екран первую половину массива.
 */
public class Home3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Введите длинну маccива: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Теперь заполните его значениями: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int b = (n+1) / 2;
        for (int i = 0; i < b; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("-Значения первой половины массива ");
    }
}








