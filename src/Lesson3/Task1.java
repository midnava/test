package Lesson3;

    //matrix    // создат ьматрицу размера 5 на 5, заполнить любыми значениями и вывест ина екран красиво
public class Task1 {
   public static void main (String[] args){

       //int[][] matrix = new int[4][4];  or:
       int matrix[][] = {
               {1,2,3,4},
               {1,2,3,4},
               {1,2,3,4},
               {1,2,3,4},
       };

       for (int i=0; i < matrix.length; i++){
           for (int j = 0; j < matrix[i].length; j++ ) {
               System.out.print(matrix[i][j] + " ");

           }
       }



   }

}
