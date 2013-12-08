package Lesson8.Task1;

import java.util.ArrayList;
import java.util.Arrays;

/**
Создать Список целых чисел из 10 елементов, посчитать сумму значений елементов списка и вывести на екран
 2/ Заполнить список случайными значениями в диапазоне от 0 до 10. вывести значения списка в обратно порядке.
 3. Заполнить списсок случайными числами от 0 до 10 и удалить все четные елементы.
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(100); // добавление елемента
        int first = list.get(0); // узнать значение по индексу
        list.set(0, 200);// метод помещения елемента в указаное место в конец списка
        list.add(0, 100);  // метод вставки елементов в любое по желанию места

        list.remove(1); // удалить
        int  index = list.indexOf(100); // метод поиска елемента, выдает номер елемента по его значению
        int size = list.size();   // размер массива
        System.out.println(list);
    }
}
