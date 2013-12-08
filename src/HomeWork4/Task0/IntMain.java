package HomeWork4.Task0;

/**
 0)В классе число, добавить методы возведения в степень, вычисление факториала и вычисления остатка от деления. для класса число.
 */
public class IntMain {
    public static void main(String[] args) {
        Int i1 = new Int();
        Int i2 = new Int();
        Int i3 = new Int();
        i1.setValue(7);
        i3.setValue(5);
        i2.setValue(3);


        //Int res = i1.plus(i2).plus(i3).minus(i1);
        Int res2 = i2.faktorial(5);
        //Int res3 = i2.ost(i3);
        Int res4 = i2.pow(3);
        //res.print();
        res2.print();
        res4.print();

    }


}