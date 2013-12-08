package lesson2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // введите любое число
        // вывести на консоль отсчет от этого числа, например 54321
        Scanner scan = new Scanner(System.in);


        int count;

        System.out.println("Введите число: ");
        if (scan.hasNextInt()) {
            count = scan.nextInt();
        } else {
            String a = scan.nextLine();
            System.out.println("Вы ввели " + a + " Попробуйте еще раз");
            return;
        }
        for (int i = count;i > 0; i-- ) {
            System.out.println(i);

        }
    }
}
