package HomeWork6;

import java.util.Scanner;

/**
 */
public class Menu {
    Ticket ticket = new Ticket();
    TicketWindow ticketWindow = new TicketWindow();

    public Menu() {
        ticketWindow.createTickets(TypeOfCoach.ПЛАЦКАРТ, 1, 75.50);
        ticketWindow.createTickets(TypeOfCoach.КУПЕ, 3, 150.75);
        ticketWindow.createTickets(TypeOfCoach.SV, 4, 279.99);
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println(ticketWindow.getCashRegister());
        System.out.println("Главное меню");
        System.out.println("Информация о билетах -1-");
        System.out.println("Продать билет        -2-");
        System.out.println("Возврат билета       -3-");

        switch (in.nextInt()) {
            case 1:
                ticketInformation();
                break;
            case 2:
                sellTicket();
                break;
            case 3:
                ticketReturn();
                break;

        }
    }

    public void ticketInformation() {
        Scanner in = new Scanner(System.in);
        System.out.println(
                          "Информация о всех доступных билетах          -1-" + '\n'
                        + "Доступные места в вагонах плацкарт           -2-" + '\n'
                        + "Доступные места в вагонах купе               -3-" + '\n'
                        + "Доступные места в вагонах SV                 -4-" + '\n'
                        + "Предыдущее меню                              -5-");
        switch (in.nextInt()) {
            case 1:
                ticketWindow.ticketInformation();
                System.out.println("Предыдущее меню -5-");
                in.nextInt();
                start();
                break;
            case 2:
                ticketWindow.ticketInformation(TypeOfCoach.ПЛАЦКАРТ);
                System.out.println("Предыдущее меню -5-");
                in.nextInt();
                start();
                break;
            case 3:
                ticketWindow.ticketInformation(TypeOfCoach.КУПЕ);
                System.out.println("Предыдущее меню -5-");
                in.nextInt();
                start();
                break;
            case 4:
                ticketWindow.ticketInformation(TypeOfCoach.SV);
                System.out.println("Предыдущее меню -5-");
                in.nextInt();
                start();
                break;
            case 5:
                start();
                break;
        }
    }

    public void sellTicket() {
        Scanner in = new Scanner(System.in);
        System.out.println(
                          "Плацкарт          -1-" + '\n'
                        + "Купе              -2-" + '\n'
                        + "SV                -3-" + '\n'
                        + "Предыдущее меню   -4-");
        switch (in.nextInt()) {
            case 1:
                ticketWindow.sellTicket(TypeOfCoach.ПЛАЦКАРТ);
                System.out.println("Предыдущее меню -5-");
                in.nextInt();
                start();
                break;
            case 2:
                ticketWindow.sellTicket(TypeOfCoach.КУПЕ);
                System.out.println("Предыдущее меню -5-");
                in.nextInt();
                start();
                break;
            case 3:
                ticketWindow.sellTicket(TypeOfCoach.SV);
                System.out.println("Предыдущее меню -5-");
                in.nextInt();
                start();
                break;
        }
    }

    public void ticketReturn() {

    }
}



