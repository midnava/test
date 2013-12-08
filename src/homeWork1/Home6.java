package homeWork1;
import java.util.Scanner;
import java.lang.Math;

/**
 * Решение квадратного уравнения.  ax(квадрат) +bx +c = 0. решить все три варианта Math.sqrt(4);
 */
public class Home6 {
     public static void main(String args[]) {
    double a, b, c;
    double  d;
    double x1, x2;
    System.out.println("Решение квадратного уравнения");
    Scanner s = new Scanner(System.in);
    System.out.print("Введите значение a -> ");
    a=s.nextDouble();
    System.out.print("Введите значение b -> ");
    b=s.nextDouble();
    System.out.print("Введите значение c -> ");
    c=s.nextDouble();
    System.out.println("a = "+a+" b = "+b+" c = "+c);

    d=(b*b)-(4*a*c);

    System.out.println("Дискриминант = "+d);

    if(d<0)
            System.out.print("Уравнение не имеет решений!!!");
    else
            if(d==0)

    {
        x1 = (-b) / (2 * a);
        System.out.println("x = " + x1);
    }

    else

    {
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        if (x1 == x2)
            System.out.println("x1 = x2 " + x1);
        else
            System.out.println("x1 =  " + x1 + "  x2 = " + x2);
    }


}
}
