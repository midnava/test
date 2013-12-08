package Lesson11.Task2;


public class Circle extends Figure {

    private double radius;


    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getPoint() {
        return super.getPoint();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double diameter() {
        double diameter = getRadius() * 2;
        return diameter;
    }

    @Override
    public double square() {
        double square = Math.pow(getRadius(), 2) * 3.14;
        return square;
    }

    @Override
    public void print() {
        System.out.println("Координаты " + "X:" + getPoint().getXPos() + " Y:" + getPoint().getYPos());
        System.out.println("Площадь круга = " + square());
        System.out.println("Диаметр круга = " + diameter());
        System.out.println();
    }
}
