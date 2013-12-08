package Lesson4;
import  java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/1/13
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task1 {
    public static void  main(String[]  args) {
        int val = 100;
        changeVar(val);
        System.out.println(val);
        int[] vector = {1,3,5};
        changeVector(vector);
        System.out.println(Arrays.toString(vector));

    }
    public static void changeVar(int val){ // Примитивы дублируются
        val++;

    }
    public static void changeVector(final int[] vector){  //Обьекты передаються ссылкой
        vector[0]++;

    }
}