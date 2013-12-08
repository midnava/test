package Lesson11.Task2;


public class Triangle extends Square {
    private int sideSize1;
    private int sideSize2;

    public Triangle(Point point, int sideSize, int sideSize1, int sideSize2) {
        super(point, sideSize);
        this.sideSize1 = sideSize1;
        this.sideSize2 = sideSize2;
    }


    public void setSideSize1(int sideSize1) {
        this.sideSize2 = sideSize1;

    }

    public void setSideSize2(int sideSize2) {
        this.sideSize2 = sideSize2;

    }


    public int getSideSize1() {
        return sideSize1;
    }

    public int getSideSize2() {
        return sideSize2;
    }

    @Override
    public double square() {
        double square = getSideSize() / 2 * getSideSize1();
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = (getSideSize() + getSideSize2() + getSideSize1());
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Координаты " + "X:" + getPoint().getXPos() + " Y:" + getPoint().getYPos());
        System.out.println("Площадь треугольника = " + square());
        System.out.println("Периметр треугольника = " + perimeter());
        System.out.println();


    }

}
