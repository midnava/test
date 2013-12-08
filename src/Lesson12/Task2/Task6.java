package Lesson12.Task2;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/30/13
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task6 {
    public static void main(String[] args) {

        int a = 2;
        int b = 1;
        int c = 1;
        int d = 0;
        int n = 5;
        repeat(a, b, c, d, n);


    }

    public static void repeat(int a, int b, int c, int d, int n) {
        if (n > 2 && a < n) {
            d = b + c;
            b = c;
            c = d;
            repeat(a + 1, b, c, d, n);

        }
        if (a == n) {
            System.out.println(d);
        }

    }
}