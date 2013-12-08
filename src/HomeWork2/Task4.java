package HomeWork2;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


/**
 6*. Удалить из предложения слова которые повторяются.
 */
public class Task4 {
    public static void main(String[] args){

        String str = "1 2 3 4 5 4 4 3 2 a b";
        Set<String> result = new LinkedHashSet<String>(Arrays.asList(str.split(" ")));
        System.out.println(result);

    }
    }

