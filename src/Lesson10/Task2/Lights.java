package Lesson10.Task2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/22/13
 * Time: 9:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Lights {
    private ArrayList<TrafficLight> list;

    public Lights(ArrayList<TrafficLight> list) {
        this.list = list;
    }

    public void start() {
        for (; true; ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < list.size(); i++) {

                list.get(i).switchLight();
                list.get(i).light();


            }
        }
    }
}
