package Lesson7.Task1;

/**
 Создать класс машина, свойства цвет год и цена, количество топлива в баке.
 Методы - ездить. Машина должна уметь завестись, метод стоп.
 создать три машины на основе класса, завести все машины, поехать все машины, остановить все три машины, две из трех поехали.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan");
        car.getName();
        car.getYear();


        //Car car1 = new Car();
        //car1.name = "Nissan";

        car.turnOn();
       // car1.turnOn();

       // car1.run();
        car.run();

        //car1.stop();
        car.stop();

        car.run();


    }
}
