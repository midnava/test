package HomeWork2;
import  java.util.Scanner;
import java.lang.CharSequence;

/**
 Строки. Ввод пароля.
 Написать программу ввода пароля пользователя.
 Пользователь вводит пароль 2 раза (второй - подтверждение)
 Пароль должен удовлетворять следующим требованиям:
 - длинна пароля должна быть от 8 до 20 символов
 - в пароле должны быть как маленькие так и большие буквы
 - должны быть цифры
 - не должен содержать слов 'password', 'pass', 'gfhjkm'
 - пароль должен совпадать с подтверждением
 */
public class Task7 {

        public static boolean isCorrectPassword(String password) {

            if (password.contains("password") || password.contains("pass")) {
                System.out.println("Пароль не должен содержать password or pass");
                return false;
            }

            if (password.length() < 8 || password.length() > 20) {
                System.out.println("Пароль должен иметь длину от 8 до 20");
                return false;
            }

            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);

                if (!((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z') ||
                        (character >= '0' && character <= '9'))) {

                    System.out.println("Должны быть только буквы и цыфры");
                    return false;
                }

            }
            return true;
        }

        public static void main(String[] args) {
            //Scanner scan = new Scanner(System.in);
            //System.out.print("Введиет пароль:");
            //System.out.println(isCorrectPassword(scan.nextLine()));
            System.out.println(isCorrectPassword("33333123ddDD"));
            System.out.println(isCorrectPassword("3333333password"));
            System.out.println(isCorrectPassword("333333333333333&&&"));
            System.out.println(isCorrectPassword("ffffffffffffffffff"));


        }


    }