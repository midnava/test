package homeWork1;

/**
 Обьявить 2 переменные целого типа, проинициализировать любыми значениями,
 поменять значения переменных местами и вывести на экран.
 */
public class Home1 {
    public static void main(String[] args){
        int a = 5;
        int b = 8;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a +" "+b);


    }
}
