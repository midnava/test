package Lesson9.Task1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Геометричесские фигуры.
 * квадрат, прямоугольник, треугольник, круг.
 * Создать классы для этих фигур и создать обьекты для этих фигур.
 * Выводить на на консоль периметр  фигуры и площадь
 * Треугольник
 * Рисовать в консоли звездочками.
 * Сделать 4 обьекта разных фигур - посчитать их общую площадь этих четырех обьектов и вывести на екран.
 * Пометстить всех в аррей лист
 * <p/>
 * нарисовать триугольник паскаля
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(2, 2), 10);
        Rectangle rectangle = new Rectangle(new Point(4, 4), 2, 3);
        Triangle triangle = new Triangle(new Point(6, 6), 6, 3, 3);
        Circle circle = new Circle(new Point(8, 8), 10);

        square.print();
        rectangle.print();
        triangle.print();
        circle.print();

        ArrayList<Figure> list = new ArrayList(Arrays.asList(square, rectangle, triangle, circle));
        SquareOfFigures sof = new SquareOfFigures(list);
        sof.squareOfFigures();


    }


}

