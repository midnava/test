package HomeWork4.Task0;

public class Int {
    private int value;

    public Int(int value) {
        this.value = value;

    }

    public Int() {

    }

    //Метод записывает переменной класса значение введенной переменной.
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }


    //Метод считает сумму 2-х элffементов типа Int.
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
    public Int minus(Int v) {
        Int res = new Int();
        res.value = value - v.value;
        return res;

    }

    // Возвращает факториал
    public Int faktorial(int val) {
        Int res = new Int(1);
        for (int i = 1; i <= val; i++) {
            res.value = res.value * i;
        }
        return res;
    }

    //Метод выводит значения
    public void print() {
        System.out.println(this.value);

    }

    public Int pow(int val) {
        Int pow = new Int();
        Int res = new Int(1);
        for (int i = 0; i < val; i++) {
            pow.value = res.value * value;
            res.value = pow.value;

        }
        return pow;
    }

    public Int ost(Int v) {
        Int res = new Int();
        res.value = value % v.value;
        return res;
    }

}

