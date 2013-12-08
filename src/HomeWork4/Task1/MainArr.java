package HomeWork4.Task1;

import java.util.Arrays;

/**
 1)Написать класс "массив".
 Нахождение минимального.
 Нахождение максимального

 Заполнение массива случайными числами в заданном диапазоне.

 *Частичное упорядочивание. с одной стороны меньшие с одной стороны массива с другой все большие числа.

 Красивый вывод на екран {2 4 5 6}

 *Увеличить размер массива. методом создания второго массива.

 */
public class MainArr {
    public static void main(String[] args) {
        MyArr arr = new MyArr(10);
        arr.random();
        arr.printArr();
        arr.printMax(arr.findMax());
        arr.printMin(arr.findMin());
        arr.sizeNew();
        arr.random();
        arr.printArr();




    }
}
