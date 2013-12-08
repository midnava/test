package HomeWork3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 03. Пользователь водит имя текстового файла. Числа разделенные пробелами.
 Зашифровать файл шифром Цезаря.

 Шифр Цезаря:
 Каждая буква шифра заменяется на другую букву, отстоящую от существующей на 3.

 например: "атакуем" - > "гхгнц.."


 03а*. То же самое, но ключ задается пользователем.

 03б*. Написать расшифратор.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите имя файла");
        String file = scaner();
        writer(file);
        reader(file);

    }

    public static void writer(String file) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write("Наша Таня громко плачет:\n" +
                "Уронила в речку мячик.\n" +
                "Таня, Танечка, не плачь,\n" +
                "Не утонет в речке мяч!" + '\n');
        writer.close();


    }

    public static String scaner() throws IOException {
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();
        return file;

    }

    public static void reader(String file) throws IOException {
        String fileEnc = "encrypt.txt";
        FileWriter writer = new FileWriter("encrypt.txt");

        FileReader reader = new FileReader(file);
        Scanner scan = new Scanner(reader);
        int step = stepNumber();
        String str;
        while (scan.hasNext()) {
            str = scan.next();
            char[] arr = new char[str.length()];
            for (int i = 0; i < arr.length; i++) {
                if (str.charAt(i) >= 65 & str.charAt(i) <= 90 | str.charAt(i) >= 97 & str.charAt(i) <= 122) {
                    if ((str.charAt(i) >= 90 - step) & (str.charAt(i) <= 90) | (str.charAt(i) >= 122 - step) & (str.charAt(i) <= 122)) {
                        arr[i] = ((char) (((int) str.charAt(i) - 25) + step));

                        writer.write(arr[i]);
                    } else {
                        arr[i] = ((char) (((int) str.charAt(i)) + step));
                        writer.write(arr[i]);

                    }
                } else {
                    if (str.charAt(i) >= 1072 & str.charAt(i) <= 1103 | str.charAt(i) >= 1040 & str.charAt(i) <= 1071) {
                        if ((str.charAt(i) >= 1103 - step) & (str.charAt(i) <= 1103) | (str.charAt(i) >= 1071 - step) & (str.charAt(i) <= 1071)) {
                            arr[i] = ((char) (((int) str.charAt(i) - 32) + step));

                            writer.write(arr[i]);

                        } else {
                            arr[i] = ((char) (((int) str.charAt(i)) + step));
                            writer.write(arr[i]);
                        }

                    }
                }
            }


            writer.write(" ");

        }


        writer.close();
        reader.close();
        decrypt(fileEnc, step);


    }

    public static int stepNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длинну шага:");
        int stepNumber = scan.nextInt();
        return stepNumber;
    }

    public static void decrypt(String fileEnc, int step) throws IOException {
        String fileDec = "decrypted";
        FileWriter writer = new FileWriter("decrypted");
        FileReader reader = new FileReader(fileEnc);
        Scanner scan = new Scanner(reader);
        String str;
        int step1 = step;
        while (scan.hasNext()) {
            str = scan.next();
            char[] arr = new char[str.length()];
            for (int i = 0; i < arr.length; i++) {
                if (str.charAt(i) >= 65 & str.charAt(i) <= 90 | str.charAt(i) >= 97 & str.charAt(i) <= 122) {
                    if ((str.charAt(i)) >= 65 & (str.charAt(i) < 65 + step) | (str.charAt(i) >= 97) & (str.charAt(i) <= 97 + step)) {
                        arr[i] = ((char) (((int) str.charAt(i) + 25) - step));

                        writer.write(arr[i]);
                    } else {
                        arr[i] = ((char) (((int) str.charAt(i)) - step));
                        writer.write(arr[i]);

                    }
                } else {
                    if (str.charAt(i) >= 1072 & str.charAt(i) <= 1103 | str.charAt(i) >= 1040 & str.charAt(i) <= 1071) {
                        if ((str.charAt(i) >= 1072) & (str.charAt(i) < 1072 + step) | (str.charAt(i) >= 1040) & (str.charAt(i) < 1040 + step)) {
                            arr[i] = ((char) (((int) str.charAt(i) + 32) - step));

                            writer.write(arr[i]);

                        } else {
                            arr[i] = ((char) (((int) str.charAt(i)) - step));
                            writer.write(arr[i]);
                        }

                    }
                }

            }

            writer.write(" ");

        }


        writer.close();
        reader.close();


    }

}




