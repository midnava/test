package Lesson3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 9/30/13
 * Time: 7:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        final int l;
        if (in.hasNextInt()) {
            l = in.nextInt();
        } else {
            System.out.println("Размер должен быть числом");
            return;
        }
        int matrix2[][] = new int[l][l];

        int b = 1;

        for (int i = 0; i < matrix2.length; i++) {


            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = b;
                b += 1;

                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();


        }
    }
}

