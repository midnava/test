package Lesson4;
import java.util.Scanner;
/**
 2) Пользователь вводит 2 строки, определить содержиться ли вторая строка в первой.
 */

public class Task7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любые символы: ");
        String str = scan.next();
        System.out.print("Введите любые символы: ");
        String str2 = scan.next();

        if(str.indexOf(str2) != -1){
            System.out.println("Строка 1 содержит подстроку 2");
        } else  {
            System.out.println("Строка 1 не содержит подстроку 2");
    }
}
}
