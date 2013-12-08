package Lesson6;

import java.util.Arrays;

/**
 * 2. задать массив размером 10 елементов, заполнить его любыми значениями от 0 до 10, методом пузырька отсортировать
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 6, 1, 4, 3, 8, 10};
        arrSort(arr);


    }

    public static void arrSort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =  arr[i];
                    arr[j] = temp;
                }
            }

            System.out.println(Arrays.toString(arr));
        }

    }

}
