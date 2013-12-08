package HomeWork4.MyString;

import java.util.Arrays;

/*3.Написать класс строка String
        Создание на основе массива символов.
        Вывод на екран.
        конкатенация
        понижение регистра
        повышение регистра
        поиск подстроки
        выделение подстроки
        удаление пробелов
        */
public class MyString {

    private char[] value;

    public MyString() {

    }

    public MyString(char[] value) {
        this.value = value;
    }

    public char[] getValue() {
        return this.value;
    }

    public void print() {
        System.out.println(value);
    }

    public char[] toLowerCaSe() {
        return null;
    }

    public char[] toUpperCaSe() {

        return null;
    }

    public MyString subString(int start, int end) {
        char[] subS = new char[end - start];
        for (int i = 0; i < end - start; i++) {
            subS[i] = value[i + start];

        }
        return new MyString(subS);
    }

    public MyString add(MyString res, MyString res2) {
        char[] mass = res.getValue();
        char[] mass2 = res2.getValue();
        char[] result = new char[mass.length + mass2.length];
        for (int i = 0; i < mass.length; i++) {
            result[i] = mass[i];
        }
        for (int i = 0; i < mass2.length; i++) {
            result[i + mass.length] = mass2[i];
        }

        return new MyString(result);
    }

    public MyString delSpace(MyString del) {
        char[] mass = del.getValue();
        int countSpace = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == ' ') {
                countSpace++;
            }
        }
        int index = 0;
        char[] res = new char[mass.length - countSpace];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != ' ') {
                res[index] = mass[i];
                index++;


            }
        }

        return new MyString(res);
    }

}