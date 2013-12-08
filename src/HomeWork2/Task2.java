package HomeWork2;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

/**
 * Найти максимальное и минимальное значение в двухмерном массиве и поменять их местами.
 */
public class Task2 {
    public static void main(String[] args) {
        int size = arr();

        int[][] array = new int[size][size];
        fill(array);
        System.out.println("++++++++++++");
        findMaxMin(array);


    }

    public static int scanner() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;

    }

    public static int arr() {
        System.out.print("Введите размер массива: ");
        int size = scanner();
        return size;

    }

    public static void fill(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10 + 5);



            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void findMaxMin(int[][] arr) {

        int max = arr[0][0];
        int imax = 0;
        int jmax =0;
        int min = arr[0][0];
        int imin = 0;
        int jmin =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    imax = i;
                    jmax = j;
                }
                if (arr[i][j] < min){
                    min = arr[i][j];
                    imin = i;
                    jmin = j;
                }
            }
        }
        System.out.println("max"+max+" min="+min+" imin="+imin+" jmin="+imin+" imax="+imax+" jmax"+jmax);
       arr[imin][jmin] = max;
       arr[imax][jmax] = min;
        for (int l = 0; l < arr.length; l++) {
            System.out.println(Arrays.toString(arr[l]));

        }
    }
}



