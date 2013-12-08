package Lesson12.Task1;

/**
 * Написать метод, яляется ли строка числом или нет
 * String str = "123";
 * String str2 = "123ee";
 * exception(str, str2);
 * <p/>
 * }
 * <p/>
 * public static void exception(String str, String str2) {
 * int num = Integer.parseInt(str);
 * System.out.println(num);
 * <p/>
 * try {
 * int num2 = Integer.parseInt(str2);
 * } catch (NumberFormatException e) {
 * System.out.println("Строка не состоит из чисел");
 * <p/>
 * }
 */
public class Task1 {
    public static void main(String[] args) {
        FindException find = new FindException();
        try {
            find.exception();

        } catch (NullPointerException e) {
            System.out.println("Передано не корректное значение" +  " "  + find.getStr2());

        }


    }

}


