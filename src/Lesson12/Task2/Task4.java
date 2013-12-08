package Lesson12.Task2;

/**
 * вывести последовательность фибоначи
 * n = (n-1) + (n-2)
 */
public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));


    }

    public static int fib(int n) {
        if (n > 2) {
            int a1 = (fib(n - 1));
            int a2 = (fib(n - 2));
            return a1 + a2;
        }
        return n;

    }
}


