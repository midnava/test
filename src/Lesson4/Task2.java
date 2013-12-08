package Lesson4;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

/**
 * Пользователь вводит размер массива одномерного, заполнить массив случайными числами.
 * Найти найбольшее значение в массиве и вывести его на екран.
 * ТОже самое для двумерного массива
 * Нахождение второго максимума в двумерном массиве.
 */
public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[findSize()];
        random(arr);
        int max = findMax(arr);
        int max2 = findMax2(arr, max);

    }

    public static int findSize() {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        size = scan.nextInt();

        return size;
    }


    public static int[] random(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);


        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }


        }
        System.out.println("Максимальное значение в массиве: " + max);
        return max;

    }

    public static int findMax2(int[] arr, int max) {
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];

            }


        }
        System.out.println("Максимальное значение в массиве после самого максимального: " + max2);
        return max2;

    }
}

