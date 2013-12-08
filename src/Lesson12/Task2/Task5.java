package Lesson12.Task2;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/30/13
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));

    }

    public static int fib(int n) {
        if (n > 2) {
            return (fib(n - 1)) + (fib(n - 2));

        } else {
            return n;
        }
    }
}

