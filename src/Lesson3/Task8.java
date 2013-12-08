package Lesson3;
import  java.util.Scanner;

/**
 написать метод выводящий на екран квадратик из звездочек, размер стороны квадрата передаеться в метод в качетсве аргумента.
 */
public class Task8 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер квадрата");
        int razmer = in.nextInt();
        razmerM(razmer);



    }
    public static void razmerM (int val){
        for (int i = 0; i < val; i++) {
            for (int j = 0; j< val; j++){
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}

