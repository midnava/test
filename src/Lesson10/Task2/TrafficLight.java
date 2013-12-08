package Lesson10.Task2;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/22/13
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class TrafficLight {
    private static int id;
    private int idNumber;
    private Color color;
    private long lightTime;
    private long lastSwitchTime;
    private Color prevColor;

    public TrafficLight(Color color, long lightTime) {
        this.color = color;
        this.lightTime = lightTime;
        setId(getId() + 1);
        this.idNumber = id;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        TrafficLight.id = id;
    }

    public void switchLight() {
        if (color.equals(Color.RED) && isTimeToSwitch()) {
            color = Color.YELLOW;
            prevColor = Color.RED;
            lastSwitchTime = System.currentTimeMillis();
        } else if (color.equals(Color.GREEN) && isTimeToSwitch()) {
            color = Color.YELLOW;
            prevColor = Color.GREEN;
            lastSwitchTime = System.currentTimeMillis();

        } else if (color.equals(Color.YELLOW) && isTimeToSwitch() && prevColor.equals(Color.RED)) {
            color = Color.GREEN;
            lastSwitchTime = System.currentTimeMillis();
        } else if (color.equals(Color.YELLOW) && isTimeToSwitch() && prevColor.equals(Color.GREEN)) {
            color = Color.RED;
            lastSwitchTime = System.currentTimeMillis();
        }
    }

    public void light() {
        System.out.println(idNumber + "-" + color);
    }

    public boolean isTimeToSwitch() {
        long currentTime = System.currentTimeMillis();
        if (lastSwitchTime + lightTime < currentTime) {
            return true;
        }
        return false;
    }
}
