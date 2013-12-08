package HomeWork6;

public class Ticket {
    private static int id = 675;
    private int idNumber;
    private String from;
    private String to;

    private int numberOfTrain;
    private int numberOfCoach;
    private int numberOfPlace;

    private double price;
    private TypeOfCoach typeOfCoach;

    public Ticket(String from, String to, int numberOfTrain, int numberOfCoach, int numberOfPlace, TypeOfCoach typeOfCoach, double price) {
        setId(getId() + 1);
        this.idNumber = id;
        this.from = from;
        this.to = to;
        this.numberOfCoach = numberOfCoach;
        this.numberOfPlace = numberOfPlace;
        this.numberOfTrain = numberOfTrain;
        this.typeOfCoach = typeOfCoach;
        this.price = price;


    }

    public Ticket() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Ticket.id = id;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public int getNumberOfCoach() {
        return numberOfCoach;
    }

    public void setNumberOfCoach(int numberOfCoach) {
        this.numberOfCoach = numberOfCoach;
    }

    public int getNumberOfPlace() {
        return numberOfPlace;
    }

    public void setNumberOfPlace(int numberOfPlace) {
        this.numberOfPlace = numberOfPlace;
    }

    public double getPrice() {
        return price;


    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TypeOfCoach getTypeOfCoach() {
        return typeOfCoach;
    }

    public void setTypeOfCoach(TypeOfCoach typeOfCoach) {
        this.typeOfCoach = typeOfCoach;
    }

    public void print() {
        System.out.println("Откуда: " +this.getFrom() + " // " + "Куда: " + this.getTo() + " // "
                + "Номер поезда: " + this.getNumberOfTrain() + " // "
                + "Тип вагона: " + this.getTypeOfCoach() + " // "
                + "Номер вагона: " + this.getNumberOfCoach() +" // "
                + "Номер места: " + this.getNumberOfPlace() + " // "
                + "Штрих код: " + this.idNumber + " // "
                + "Цена: " + this.price);
    }
}
