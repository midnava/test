/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/6/13
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.FileWriter;

public class TEST {


    public static void main(String[] args) {

        char[] charArray = chArr();
        //printMatrix(userMatrix(charArray));
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(i + " <=> " + charArray[i]);
        }
    }


    private static char[] chArr() {
        final int SIZE = 1200;
        char[] chArr = new char[SIZE];
        char charElement = 'a';

        for (int k = 0; k < SIZE; k++) {
            charElement = (char) k;
            chArr[k] = charElement;
        }


        return chArr;


    }
}