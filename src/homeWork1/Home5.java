package homeWork1;

/**
 Заданы 2 массива одинаковой длинны, скопировать данные из первого массива во второй и вывести оба массива на екран.
 */
public class Home5 {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[6];
        arr2 = arr1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);

        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}
