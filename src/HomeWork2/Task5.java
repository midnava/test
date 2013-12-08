package HomeWork2;

/*4. Найти строку в двухмерном массиве, имеющую самую большую сумму цифр
5. Поменять местами самую большую и самую маленькою строку
        */
public class Task5 {


    public static int findMaxStr(int[][] array) {
        int resultStSum = 0;
        int resultStrIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int strSum = 0;
            for (int j = 0; j < array.length; j++) {
                strSum += array[i][j];
            }
            if (resultStSum <= strSum) {
                resultStSum = strSum;
                resultStrIndex = i;
            }

        }
        return resultStrIndex;
    }

    public static int findMinStr(int[][] array) {
        int resultStSum = 0;
        int resultStrIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int strSum = 0;
            for (int j = 0; j < array.length; j++) {
                strSum += array[i][j];
            }
            if (resultStSum >= strSum) {
                resultStSum = strSum;
                resultStrIndex = i;
            }

        }
        return resultStrIndex;
    }

    public static void replace(int[][] array, int indexFrom, int indexTo) {
        int[] arrayFrom = array[indexFrom];
        int[] arrayTo = array[indexTo];
        array[indexFrom] = arrayTo;
        array[indexTo] = arrayFrom;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        printArray(array);
        System.out.println("Max index = " + findMaxStr(array));
        System.out.println("Min index = " + findMinStr(array));
        System.out.println("After Replace ->");
        replace(array, findMaxStr(array), findMinStr(array));
        printArray(array);
    }
}