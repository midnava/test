package HomeWork4.MyString;

import java.io.IOException;
import java.util.Scanner;

/**
 * 3.Написать класс строка String
 * Создание на основе массива символов.
 * Вывод на екран.
 * конкатенация
 * понижение регистра
 * повышение регистра
 * поиск подстроки
 * выделение подстроки
 * удаление пробелов
 */
public class MainString {
    public static void main(String[] args) throws IOException {

        MyString myString = new MyString();
        //myString.print();

        char[] hello = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] helloW = new char[]{'h', 'e', 'l', 'l', 'o',' ','w','o','r','l','d',' '};
        char[] help =  new char[] {'h','e','l','p'};
        MyString str = new MyString(hello);
        MyString str2 = new MyString(help);
        //myString.print();
        MyString strRes= str.subString(0, 3);
        strRes.print();
        MyString strRes2 = str2.subString(3,4);
        strRes2.print();

        MyString conc = new MyString();
        MyString concRes = conc.add(strRes, strRes2);
        concRes.print();
        concRes.toUpperCaSe();

        String strin = "asfasf";
        strin.toUpperCase();
        MyString str3 = new MyString(helloW);
        MyString spaceDel = new MyString();
        MyString spaceRes = spaceDel.delSpace(str3);
        spaceRes.print();



    }
}
