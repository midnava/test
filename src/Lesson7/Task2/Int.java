package Lesson7.Task2;
public class Int {
    private int value;

    //Метод записывает переменной класса значение введенной переменной.
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }


    //Метод считает сумму 2-х элементов типа Int.
    public Int plus(Int v) {

        Int res = new Int();
        res.value = value + v.value;
        return res;
    }

    //Метод считает умножение 2-х элементов типа Int.
    public Int multip(Int v) {

        Int res = new Int();
        res.value = value * v.value;
        return res;
    }

    //Метод считает деление 2-х элементов типа Int.
    public Int div(Int v) {

        Int res = new Int();
        res.value = value / v.value;
        return res;
    }
    //Метод считает минус 2-х элементов типа Int.
    public Int minus(Int v){
        Int res = new Int();
        res.value = value - v.value;
        return res;

    }
    //Метод выводит значения
    public void print(){
        System.out.println(this.value);

    }

}

