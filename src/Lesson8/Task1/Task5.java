package Lesson8.Task1;

import java.util.ArrayList;

/**
 * 3. Заполнить списсок случайными числами от 0 до 10 и удалить все четные елементы.
 */
public class Task5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i, (int) (Math.random() * 10 + 1));
            list2 = list;


        }
        System.out.print(list2);
        System.out.println();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list2.remove(i);

            }
        }
        System.out.print(list2);


    }


}

