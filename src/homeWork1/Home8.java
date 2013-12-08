package homeWork1;

import java.util.Scanner;

/**
 * Пользователь вводит число - номер билета(билет из 6 чисел)
 * (первая половина билета должна быть равно сумме второй половине билета), проверить яляеться ли билет счастливым

public class Home8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число билета: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число билета: ");
        int b = scan.nextInt();
        System.out.println("Введите третье число билета: ");
        int c = scan.nextInt();
        System.out.println("Введите четвертое число билета: ");
        int d = scan.nextInt();
        System.out.println("Введите пятое число билета: ");
        int e = scan.nextInt();
        System.out.println("Введите шестое число билета: ");
        int f = scan.nextInt();

        int first = a + b + c;
        int second = d + e + f;
        System.out.println(first);

        if (first == second) {
            System.out.println("Поздравляем");
        } else {
            System.out.println("Ищите дальше");
        }

    }
}  */

public class Home8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер билета: ");


        if (scan.hasNextInt()) {
            int bilet = scan.nextInt();
            System.out.println("Номер вашего билета: " + bilet);
            String i = ""+bilet;


            System.out.println(i.length()+" цифр"+" последняя "+i.charAt(i.length()-1));

            int a = i.charAt(i.length()-1);
            int b = i.charAt(i.length()-2);
            int c = i.charAt(i.length()-3);
            int d = i.charAt(i.length()-4);
            int e = i.charAt(i.length()-5);
            int f = i.charAt(i.length()-6);

            int first = a + b + c;
            int second = d + e + f;


            if (first == second) {
                System.out.println("Поздравляем");
            } else {
                System.out.println("Ищите дальше");
            }
        }

}
}

/*
 public static void main(String[] args){

	        Scanner scan=new Scanner(System.in);
	        System.out.println("Введите число 6 цифр");
	        int numberTicket;
	        numberTicket=scan.nextInt();
	        int[] array=new int[6];

	        for(int i=5;i>=0;i--){
	           array[i]=numberTicket%10;
	            numberTicket=numberTicket/10;
	        }
	        int sum1=0;
	        int sum2=0;
	        for (int i=0;i<3;i++){
	            sum1=array[i];
	        }
	        for (int i=3;i<6;i++){
	            sum2=array[i];
	        }
	        System.out.println("");
	        System.out.println("проверяем билетик...");
	        if(sum1==sum2){
	            System.out.println("ваш билет счастливый!");
	        }else{
	            System.out.println("не счастливый.");
	        }
	    }
}
*/