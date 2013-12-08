package Lesson6;

import java.util.Arrays;

/**
 * 1 задать массив размером 10 елементов, заполнить его любыми значениями от 0 до 10 , написать метод упорядочивающий массив методом выбора.
 * без доп массива.
 *
 * 3. Алгоритм вставка
 * частотный криптонакс*
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 6, 1, 4, 3, 8, 10};
        arrSort(arr);


    }

    public static void arrSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }
                System.out.println(Arrays.toString(arr));
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }





    }

}

