package HomeWork4.Task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1)Написать класс "массив".
 * Нахождение минимального.
 * Нахождение максимального
 * <p/>
 * Заполнение массива случайными числами в заданном диапазоне.
 * <p/>
 * Частичное упорядочивание. с одной стороны меньшие с одной стороны массива с другой все большие числа.
 * <p/>
 * Красивый вывод на екран {2 4 5 6}
 * <p/>
 * Увеличить размер массива. методом создания второго массива.
 */
public class MyArr {
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = size;
        arr = new int[size];

    }

    public MyArr() {

    }

    public int getSize() {
        return this.size;
    }

    public void random() {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);

        }

    }

    public int findMax() {
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    public void printMax(int max) {
        System.out.println("MAX " + "{" + max + "}");

    }

    public int findMin() {
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }

    public void printMin(int min) {
        System.out.println("MIN " + "{" + min + "}");

    }

    public void printArr() {
        System.out.print("{");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }

        }
        System.out.print("}");
        System.out.println();
    }

    public void sizeNew() {
        Scanner scan = new Scanner(System.in);
        System.out.print("на сколько увеличить массив?");
        int size2 = scan.nextInt();
        arrCopy(size2);
    }

    public void arrCopy(int size2) {
        int[] arr2 = new int[size + size2];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr[i];

        }
        arr = arr2;
        size  = size + size2;
    }



}



