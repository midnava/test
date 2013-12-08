package Lesson10.Task2;

import java.util.ArrayList;

/**
 текущий цвет светофора.
 Время горениця одного цвета.
 Сделать метод екшин у светофора, он будет включать светофор.
 Как работает светофор?
 1 цвет горит столько сколько мы указали, потом переключение на след цвет, и по кругу.
 Thread.sleep(); например 1000 - пауза 1 секунда.

 try{
 Thread.sleep(2000);


 }catch (Interupted.Exception);

 Создать класс набор из 10 светофоров. разные задержки - разный текущий цвет.
 Сделать метод свитч - включение.  раз в секунду
 Узнать текущее время можно узнать у System.currentTimeMillis();
}
 */
public class MainTraffic {
    public static void main(String[] args) {
        ArrayList<TrafficLight> list = new ArrayList<TrafficLight>();
        list.add(new TrafficLight(Color.RED, 1000));
        list.add(new TrafficLight(Color.RED, 1000));
        list.add(new TrafficLight(Color.RED, 1000));
        list.add(new TrafficLight(Color.RED, 1000));

        Lights lights = new Lights(list);
        lights.start();

    }
}

