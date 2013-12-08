package HomeWork2;

import java.util.Scanner;
import java.util.Arrays;

/**
 * вывести в консоль элементы той половины одномерного массива у которой
 * среднее арифметическое максимальное.
 */
public class Task1 {
    public static void main(String[] args) {
        int size = massiv();
        int[] arr = new int[size];
        znachArr(arr);
        int[] firstHalfArr = firstHalf(arr);
        int[] secondHalfArr = secondHalf(arr);
        int sum1 = sum(firstHalfArr);
        int sum2 = sum(secondHalfArr);
        System.out.println(sum1 + " " + sum2);
        finalTask(firstHalfArr, secondHalfArr, sum1, sum2);
    }

    public static int scanner() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    public static int massiv() {
        System.out.print("Введите размер массива: ");
        int size = scanner();
        return size;
    }

    public static void znachArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значения массива: ");
            arr[i] = scanner();
        }
    }

    public static int[] firstHalf(int[] arr) {
        int[] firstHalfArr = new int[arr.length / 2];
        for (int i = 0; i < firstHalfArr.length; i++) {
            firstHalfArr[i] = arr[i];
        }

        return firstHalfArr;

    }

    public static int[] secondHalf(int[] arr) {
        int[] secondHalfArr = new int[arr.length / 2];
        int h = ((arr.length + 1) / 2);
        for (int i = h; i < arr.length; i++) {
            secondHalfArr[i - h] = arr[i];
        }
        return secondHalfArr;
    }

    public static int sum(int[] sumArr) {
        int sum = 0;
        for (int i = 0; i < sumArr.length; i++) {
            sum += sumArr[i] / sumArr.length;


        }
        return sum;


    }

    public static void finalTask(int[] f, int[] s, int sum1, int sum2) {
        if (sum1 > sum2) {
            System.out.println("Первый массив больше второго" + Arrays.toString(f));
        }
        if (sum1 == sum2) {
            System.out.println("Массивы равны");

        } else  {
            System.out.println("Второй массив больше первого" + Arrays.toString(s));
        }

    }

}
