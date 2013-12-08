package Lesson11.Task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
27 Декабря выезд из Киева.
 Какого числа лучше купить билет с макимальной вероятностью/
 */
public class Task1 {
    public static void main(String[] args) {
        // создаем календарь
        GregorianCalendar gr = new GregorianCalendar(2013, 11, 27);
        // отнимаем 45 дней от заданной даты
        gr.add(Calendar.DAY_OF_MONTH, -45);
        System.out.println(gr.getTime());

        // получаем дату когда нужно купить билет
        System.out.println(gr.get(Calendar.YEAR) + " " + gr.get(Calendar.MONTH) + " " + gr.get(Calendar.DAY_OF_MONTH));

        SimpleDateFormat sim = new SimpleDateFormat("yyy MM dd");
        String date = sim.format(gr.getTime());

        System.out.println(date);





    }
}
