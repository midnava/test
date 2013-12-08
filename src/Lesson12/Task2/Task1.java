package Lesson12.Task2;

/**
 * ПОльзователь вводит 2 числа вывести все до это го числа и обратно
 */
public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        int count = 10;
        repeat(i, count);
        repeat2(i, count);


    }

    public static void repeat(int i, int count) {
        if (count >= i) {
            System.out.println("i = " + count);
            repeat(i, count - 1);

        }
    }


    public static void repeat2(int i, int count) {
        if (i <= count) {
            System.out.println("i = " + i);
            repeat2(i +1, count);

        }

    }
}


