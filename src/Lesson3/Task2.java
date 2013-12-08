package Lesson3;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 9/30/13
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task2 {
    public static void main(String[] args) {
        int matrix2[][] = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
        };

        for (int i = 0; i < matrix2.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix2[i].length; j++) {

                if (j != matrix2.length - 1) {
                    System.out.print(matrix2[i][j] + ",");

                } else {
                    System.out.print(matrix2[i][j]);
                }

            }
            System.out.println("]");

        }
    }
}
