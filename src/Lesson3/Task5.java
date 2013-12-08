package Lesson3;

/**
 *Написать метод возводящий числов в квадрта
 * написать метод выводящий на екран квадратик из звездочек, размер стороны квадрата передаеться в метод в качетсве аргумента.
 * Написать метод заполняющий  двумерный массив случайными значениями. в метод передаеться 3 значения, массив, левая граница диапазона иправая граница случайных значений
 *
 * Date: 9/30/13
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task5 {
    public static void main(String[] args) {
        int count = 100;
        printLine(2);
        printLine(3);
        printLine(4);
        printValue(100);
        printValue(count);
        int res = add(2, 2);
        System.out.println(res);
        double res2 = pow(3, 2);
        System.out.println(res2);

    }

    public static void printLine(int count) {
        System.out.println("****");
    }
    public static void printValue(int value)  {
        System.out.println(value);
    }
    public static int add(int first, int second){
        int sum = first + second;
        return sum;

    }
    public static double pow(int val, int val2){
       double sum2 = val* val2;
        return sum2;


    }
}



