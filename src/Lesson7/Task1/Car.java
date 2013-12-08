package Lesson7.Task1;


/**
 * В классе машина реализовать инкапсуляцию и сделать три конструктора. 1 поумолчанию 2, консутрктор со всеми параметрами
 * 3. конструктор с двумя самыми важными параметрами.
 * public void setColor(String color){
 * this.color = color; мутатор
 * }
 * public String getColor(){
 * return this.color;
 * }
 */
public class Car {
    private String name;
    private String color;
    private int year;
    private double fuel = 250;
    private double price;
    private boolean isStarted = false;
    private int dist = 200;

    public Car(String name) {
        this.name = name;

    }

    public void Car(String name, String color, int year, double fuel, double price, boolean isStarted, int dist) {
        this.color = "white";
        this.year = 2010;
        this.fuel = 250;
        this.price = 2000;
        this.isStarted = isStarted;
        this.dist = 200;


    }

    public Car(String name, String color, int year, double fuel, double price, boolean isStarted, int dist) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.fuel = fuel;
        this.price = price;
        this.isStarted = isStarted;
        this.dist = dist;

    }

    public void turnOn() {
        isStarted = true;
        System.out.println(name + ":" + " завелась ");

    }

    public void run() {
        if (isStarted != true) {
            System.out.println(name + ":" + " Вначале заведи машину");
            return;
        }
        System.out.println(name + ":" + " рррррррррррррр ");
    }

    public void stop() {
        isStarted = false;
        System.out.println(name + ":" + " приехал");

        for (int i = 0; i < dist; i++) {
            fuel--;
            if (fuel < 0){
                System.out.println("Зааправся");
            }
        }
        System.out.println("Осталось бензина " + fuel);
        System.out.println("Проехали метров " + dist);
    }

    public void setName(String name) {
        this.name = "volvo";
    }

    public String getName() {
        return this.name;
    }

    public void setColor(String color) {
        this.color = "black";
    }

    public String getColor() {
        return this.color;
    }

    public void setYear(int year) {
        year = 2013;
    }

    public int getYear() {
        return year;
    }

    public void setFuel(double fuel) {
        fuel = 400;
    }

    public double getFuel() {
        return fuel;
    }

    public void setPrice(double price) {
        price = 15000.0;
    }

    public double getPrice() {
        return price;
    }

    public void setDist(int dist) {
        dist = 250;

    }

    public int getDist() {
        return dist;
    }


}
