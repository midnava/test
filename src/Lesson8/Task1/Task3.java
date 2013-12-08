package Lesson8.Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 Создать Список целых чисел из 10 елементов, посчитать сумму значений елементов списка и вывести на екран
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 10, 20, 10, 10, 10, 10, 10, 10, 10));

        Integer val = new Integer(0);
        for (int i = 0; i < list.size(); i++){
             val += list.get(i);



        }
        System.out.print(val);
    }
}
