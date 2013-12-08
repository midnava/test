package Lesson6;

import java.util.Arrays;

/**
 * 3. Алгоритм вставка
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 6, 1, 4, 3, 8, 10};
        arrSort(arr);


    }

    public static void arrSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }
                System.out.println(Arrays.toString(arr));
            }

        }


    }
}