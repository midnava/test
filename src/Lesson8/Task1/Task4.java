package Lesson8.Task1;

import java.util.ArrayList;

/**
 * 2/ Заполнить список случайными значениями в диапазоне от 0 до 10. вывести значения списка в обратно порядке.
 */
public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < 10; i++) {
            list.add(i, (int) (Math.random()*100));
            //System.out.print(list.get(i));
           // System.out.println();
            //System.out.print(list);
            System.out.print(list.get(i)+" ");
        }
        //System.out.print(list);
        System.out.println();

        for (int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }
        //System.out.print(list);
        //System.out.print(list);
       /*int count = 0;
        while (count < 10) {
            list.add(count, (int) Math.random() * 100);
            count++;
            System.out.println(list.);
       */ }
    }



