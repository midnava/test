package Lesson11.Task2;


public class Rectangle extends Figure {
    private int sideSize;
    private int sideSize2;


    public Rectangle(Point point, int sideSize, int sideSize2) {
        super(point);
        this.sideSize = sideSize;
        this.sideSize2 = sideSize2;


    }

    @Override
    public Point getPoint() {
        return super.getPoint();    //To change body of overridden methods use File | Settings | File Templates.
    }



    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;

    }

    public void setSideSize2(int sideSize2) {
        this.sideSize2 = sideSize2;

    }

    public int getSideSize() {
        return sideSize;
    }

    public int getSideSize2() {
        return sideSize2;
    }

    @Override
    public double square() {
        double square = getSideSize() * getSideSize2();
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = getSideSize() * 2 + getSideSize2() * 2;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Координаты " + "X:" + getPoint().getXPos() + " Y:" + getPoint().getYPos());
        System.out.println("Площадь прямоугольника = " + square());
        System.out.println("Периметр прямоугольника = " + perimeter());
        System.out.println();


    }
}
