package Lesson11.Task2;

import java.util.ArrayList;


public class SquareOfFigures {
    private ArrayList<Figure> list;

    public SquareOfFigures(ArrayList<Figure> list) {
        this.list = list;

    }

    public void squareOfFigures(){
        double squareFigures = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Площадь фигуры " + i + " = " + list.get(i).square());
            squareFigures += list.get(i).square();

        }
        System.out.println("Сумма площадей фигур = " + squareFigures);

    }
}
