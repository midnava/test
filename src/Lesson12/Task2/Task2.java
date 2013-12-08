package Lesson12.Task2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/29/13
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число");
        int a = in.nextInt();
        System.out.print("Второе число");
        int b = in.nextInt();
        repeat(a, b);

    }


    public static void repeat(int a, int b) {
        if (a != b) {
            System.out.println(a);
            repeat(a + 1, b);

       }


    }
}
