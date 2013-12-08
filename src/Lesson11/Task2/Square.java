package Lesson11.Task2;


public class  Square extends Rectangle {

    private int sideSize;


    public Square(Point point, int sideSize) {
        super(point, sideSize, sideSize);
    }


    @Override
    public void print() {
        System.out.println("Координаты " + "X:" + getPoint().getXPos() + " Y:" + getPoint().getYPos());
        System.out.println("Площадь квадрата = " + square());
        System.out.println("Периметр квадрата = " + perimeter());
        System.out.println();


    }


}


