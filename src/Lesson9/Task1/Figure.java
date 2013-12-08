package Lesson9.Task1;

/**

 */
abstract class Figure {

    private Point point;


    public Figure(Point point) {
       this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public double square() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void print() {


    }
}
