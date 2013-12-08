package HomeWork2;

import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;


/**
 * Известны результаты каждой из 4х четвертей баскетбольной встречи.
 * Нужно определить победителя матча.
 * Вход:
 * 26 17
 * 13 15
 * 19 11
 * 14 16
 * Выход:
 * 1
 */
public class Task0 {
    public static void main(String[] args) {
       String[] str = count();
        int [] firstCommand = convertor(str);
        int [] secondCommand = convertor2(str);
        int sumFirst = sumFirtsCommand(firstCommand);
        int sumSecond = sumSecondCommand(secondCommand);
        winner(sumFirst, sumSecond);

    }

    public static String[] count() {
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = schet();

        }
        return str;
    }

    public static String schet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите счёт: ");

        String str = " ";
        boolean bool = true;
        while (bool) {
            String str1 = scan.nextLine();
            if (str1.length() == 5) {
                if (str1.charAt(2) == ' ') {
                    str = str1;
                    bool = false;
                } else {
                    System.out.println("Введи числа через пробел!");
                }
            } else {
                System.out.println("Ошибка ввода, фатал эррор");
            }
        }
        return (str);
    }
    public static int[] convertor(String str[]){
           int[] firstCommand = new int[4];
        for (int i = 0; i < firstCommand.length; i++){
            firstCommand[i] = Integer.parseInt(str[i].substring(0,2));
        }
        return firstCommand;
    }
    public static int[] convertor2(String str[]){
        int[] secondCommand = new int[4];
        for (int i = 0; i < secondCommand.length; i++){
            secondCommand[i] = Integer.parseInt(str[i].substring(3,5));
        }
        return secondCommand;

    }
    public static int sumFirtsCommand(int[] firstCommand){
        int sumFirst = 0;
        for (int i = 0;i < firstCommand.length; i++){
            sumFirst += firstCommand[i];
        }
        System.out.println("Сумма очков первой команды: " +sumFirst);
      return sumFirst;
    }
    public static int sumSecondCommand(int[] secondCommand){
        int sumSecond = 0;
        for (int i = 0;i < secondCommand.length; i++){
            sumSecond += secondCommand[i];
        }
        System.out.println("Сумма очков второй команды: " +sumSecond);
        return sumSecond;
}
    public static void winner(int sumSecond, int sumFirst){
        if (sumFirst < sumSecond){
            System.out.println("Победила первая команда");
        }  else {
            System.out.println("Победила вторая команда");

        }

    }
}





