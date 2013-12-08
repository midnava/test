package Lesson7.Task2;
public class MainInt {

    public static void main(String[] args) {
        Int i1 = new Int();
        Int i2 = new Int();
        Int i3 = new Int();
        i1.setValue(3);
        i2.setValue(5);
        i3.setValue(5);

        Int res = i1.plus(i2).plus(i3).minus(i1);

        res.print();


    }


}