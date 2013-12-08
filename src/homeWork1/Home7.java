package homeWork1;

import java.util.*;
import java.lang.*;
/**
 * Создать массив, заполнить его случайными значениями,
 * поменять местами значения найбольшего и найменьшего елемента в массиве. Math.random()* 10;
 */
public class Home7 {
    public static void main(String[] args) {
        int[] arr = new int[11];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");

        }
        System.out.println("");

        int max = arr[0];
        int imax = 0;
        int min = arr[0];
        int imin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
        }
        arr[imin] = max;
        arr[imax] = min;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");



    }




    }

}

