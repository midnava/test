package Lesson4;
import java.util.Scanner;
import java.lang.Math;
import  java.util.Random;
import java.util.Arrays;

/**
 Пользователь вводит размер массива одномерного, заполнить массив случайными числами.
 Найти найбольшее значение в массиве и вывести его на екран.
 ТОже самое для двумерного массива
 Нахождение второго максимума в двумерном массиве.

 */
public class Task3 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива");

        int razmer = scan.nextInt();
        int[][] arr = new int[razmer][razmer];
        random(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void random(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j=0; j< arr.length; j++){
            arr[i][j] = (int) (Math.random()* 10+1);
            //System.out.print(arr[i]);

        }

    }
}
}