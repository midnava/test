package HomeWork2;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

/**
 * 7. Нули
 * Требуется найти самую длинную непрерывную цепочку нулей в последовательности нулей и единиц.
 * Ввод:
 * 10001101001
 * Вывод:
 * 2
 * 3
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку состоящую из нолей и едениц: ");
        String str = scan.nextLine();

        char ff = '0';
        int tmpSum = 0;
        int resultSum = 0;
        int resultIndex = 0;
        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == ff) {
                tmpSum++;
                if (i == str.length() - 1) {
                    if (resultSum < tmpSum) {
                        resultSum = tmpSum;
                        resultIndex = i;
                    }
                }
            } else {
                if (resultSum < tmpSum) {
                    resultSum = tmpSum;
                    resultIndex = i;
                }
                tmpSum = 0;
            }
        }
        System.out.println(str);
        System.out.println("Index = " + (resultIndex - resultSum));
        System.out.println("Max zero string = " + resultSum);


    }
}


