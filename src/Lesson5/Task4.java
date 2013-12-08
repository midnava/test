package Lesson5;

import java.util.Scanner;

/**
 5. Написать метод который вычисляет факториал.
 */
public class Task4 {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int faktorial = scan.nextInt();

        long result = 1;
        for (int i = 1; i <= faktorial; i++){
            result *= i;


        }
        System.out.println("Факториал числа <" + faktorial + "> = " + result);

    }
}
