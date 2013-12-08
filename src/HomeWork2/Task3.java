package HomeWork2;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

/**
 * Найти строку в двухмерном массиве, имеющую самую большую сумму цифр
 */
public class Task3 {
    public static void main(String[] args) {
        int size = scanner();
        int[][] arr = new int[size][size];
        randomArr(arr);
        int[] arrRes = new int[size];
        sum(arr, arrRes);
        System.out.println(Arrays.toString(arrRes));
        result(arrRes);



    }

    public static int scanner() {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        return size;

    }
    public static void randomArr(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = (int) (Math.random()* 10 +1);

            }
            System.out.println(Arrays.toString(arr[i]));

        }
    }
    public static void sum(int[][] arr, int[]arrRes){
        int index = 0;
        while (index < arr.length){
            for (int i = 0; i < arr.length; i ++){
                arrRes[i] += arr[i][index];
            }
            index++;
        }
    }
    public static void  result(int[] arrRes){
        int max = 0;
            for (int i = 0; i < arrRes.length; i++){
            if (arrRes[i] > max) {
                max = arrRes[i];

            }
        }
        System.out.println("MAX= " +max);

    }
}
