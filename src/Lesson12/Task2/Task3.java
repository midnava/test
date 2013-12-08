package Lesson12.Task2;

/**
Факториал
n! = (n-1)*!n;
 */
public class Task3 {
    public static void main(String[] args) {
        int n = 5;
        faktorial(n);


    }
    public static int faktorial(int n){
        if (n == 1){
            return 1;
        }
        int fact = faktorial(n-1)*n;
        System.out.println(fact);
        return fact;

    }
}
