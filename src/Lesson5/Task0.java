package Lesson5;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/12/13
 * Time: 9:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task0 {


    public static void main(String[] args) {
        System.out.println("While");
        int i = 0;
        while (i < 10) {
            System.out.print(i);
            i++;
        }

        System.out.println("do-while");
        i = 0;
        do {
            System.out.print(i);
            i++;
        } while (i < 10);

        int[] vector = {1, 2, 3, 4, 5};
        for (int el : vector) {
            System.out.print(el + ' ');
        }
    }

}

