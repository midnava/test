package Lesson5;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/12/13
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Diablo {
    public static void main(String[] args) {

        System.out.println("\n 5 шагов \n");
        printDiablo(5);

        System.out.println("\n 7 шагов \n");
        printDiablo(7);

        System.out.println("\n 10 шагов \n");
        printDiablo(10);
    }

    private static void printDiablo(final int STEPS) {
        final int PARTICIPANTS = 7;
        double[] distances = new double[PARTICIPANTS];
        String[] names = new String[PARTICIPANTS];

        distances[0] = calcPow3(STEPS);
        names[0] = "pow3";

        distances[1] = calcSqrt(STEPS);
        names[1] = "sqrt";

        distances[2] = calcPow2(STEPS);
        names[2] = "pow2";

        distances[3] = calcN(STEPS);
        names[3] = "n";

        distances[4] = calcLn(STEPS);
        names[4] = "ln";

        distances[5] = calcFactor(STEPS);
        names[5] = "factor";

        distances[6] = calcExp(STEPS);
        names[6] = "exp";

        quickSort(names, distances, 0, PARTICIPANTS - 1);
        printArray(names, distances);
    }

    private static void printArray(String[] names, double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print('\t' + names[i] + '\t');
            System.out.println(vector[i]);
        }
    }

    private static double calcLn(int steps) {
        double distance = Math.log(steps);
//        return "Ln("+distance+")" + createLine(distance);
        return distance;
    }

    private static double calcN(int steps) {
        double distance = steps;
//        return "N("+distance+")" + createLine(steps);
        return distance;
    }

    private static double calcPow2(int steps) {
        double distance = Math.pow(steps, 2);
//        return "N^2("+distance+")" + createLine(distance);
        return distance;
    }

    private static double calcExp(int steps) {
        double distance = Math.pow(3, steps);
//        return "3^N("+distance+")" + createLine(distance);
        return distance;
    }

    private static double calcFactor(int steps) {
        int distance = factor(steps);
//        return "Fact("+distance+")" + createLine(distance);
        return distance;
    }

    private static int factor(int number) {
        if(number == 1) {
            return 1;
        }
        return factor(number - 1) * number;
    }

    private static double calcSqrt(int steps) {
        double distance = Math.sqrt(steps);
//        return "Sqrt("+distance+")" + createLine(distance);
        return distance;
    }

    private static double calcPow3(int steps) {
        double distance = Math.pow(steps, 3);
//        return "N^3("+distance+")" + createLine(distance);
        return distance;
    }

    private static String createLine(double steps) {
        String result = "";
        for(int i=0; i<steps; i++) {
            result = result + '*';
        }
        return result;
    }

    public static void quickSort(String[] names, double[] vector, int left, int right) {
        int l = left;
        int r = right;
        while (l < r) {
            int pivotIndex = (left + right) / 2;
            double pivot = vector[pivotIndex];
            while (l <= r) {
                while (vector[l] < pivot) {
                    l++;
                }

                while (vector[r] > pivot) {
                    r--;
                }

                if (l <= r) {
                    double tmp = vector[l];
                    String tmpS = names[l];
                    vector[l] = vector[r];
                    names[l] = names[r];
                    vector[r] = tmp;
                    names[r] = tmpS;
                    l++;
                    r--;
                }
            }
            if (left < r) {
                quickSort(names, vector, left, r);
            }
            if(l < right ) {
                quickSort(names, vector, l, right);
            }
        }
    }
}





