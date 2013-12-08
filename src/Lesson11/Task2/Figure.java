package Lesson11.Task2;


abstract class Figure implements Figurable {

    private Point point;


    public Figure(Point point) {
        this.point = point;
    }

    public Figure() {

    }


    public Point getPoint() {
        return point;
    }


}


