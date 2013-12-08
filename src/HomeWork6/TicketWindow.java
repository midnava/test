package HomeWork6;

import java.util.ArrayList;
/**

 */
public class TicketWindow {
    private double cashRegister;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    private ArrayList<Ticket> soldTickets = new ArrayList<Ticket>();

    public TicketWindow() {

    }

    public double getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(double cashRegister) {
        this.cashRegister = cashRegister;
    }

    public int size() {
        return soldTickets.size();
    }

    public void createTickets(TypeOfCoach typeOfCoach, int numberOfCoach, double price) {
        int numberOfPlace = 1;
        for (int i = 0; i < 500; i++) {
            if (numberOfCoach <= 2) {
                tickets.add(i, new Ticket("Kyiv", "Nizhin", 902, numberOfCoach, numberOfPlace, typeOfCoach, price));
                numberOfPlace = numberOfPlace + 1;
                if (numberOfPlace > 10) {
                    numberOfPlace = 1;
                    numberOfCoach = numberOfCoach + 1;
                    if (numberOfCoach == 3) {
                        break;
                    }
                }
            }

            if (numberOfCoach >= 3) {
                tickets.add(i, new Ticket("Kyiv", "Nizhin", 902, numberOfCoach, numberOfPlace, typeOfCoach, price));
                numberOfPlace = numberOfPlace + 1;
                if (numberOfPlace > 5) {
                    numberOfPlace = 1;
                    numberOfCoach = numberOfCoach + 1;
                    if (numberOfCoach == 4) {
                        break;
                    }
                }
            }
            if (numberOfCoach >= 4) {
                tickets.add(i, new Ticket("Kyiv", "Nizhin", 902, numberOfCoach, numberOfPlace, typeOfCoach, price));
                numberOfPlace = numberOfPlace + 1;
                if (numberOfPlace > 2) {
                    numberOfPlace = 1;
                    numberOfCoach = numberOfCoach + 1;
                    if (numberOfCoach == 5) {
                        break;
                    }
                }

            }
        }
    }

    public void ticketInformation() {
        for (int i = 0; i < tickets.size(); i++) {
            tickets.get(i).print();
        }
    }

    public void ticketInformation(TypeOfCoach typeOfCoach) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getTypeOfCoach() == typeOfCoach) {
                tickets.get(i).print();
            }
        }
    }

    public void sellTicket(TypeOfCoach typeOfCoach) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getTypeOfCoach() == typeOfCoach) {
                Ticket ticket = tickets.get(i);
                soldTickets.add(ticket);
                cashRegister = cashRegister + ticket.getPrice();
                tickets.remove(i);
                ticket.print();
                break;
            } else {
                System.out.println("Места в вагонах " + typeOfCoach + " закончились");
                break;
            }
        }
    }
}
