package HomeWork5;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/25/13
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Humans  {
    private static int id;
    private int idNumber;
    private String surName;                            // фамилия сотрудника
    private String name;                               // имя
    private String middleName;                         // отчество
    private String sex;                                // пол
    private Date dateOfbirth;                          // дата рождения
    private double wageRate;                           // зарплата  ставка
    private double account;                            // счет сотрудника куда падет зп и всякие бонусы
    private double bonus;                              // бонусы
    private int seniority;                             // стаж
    private int sumDaysForVocation;                    // количесто дней для отпуска, за 1 месяц начисляется 2 дня отпуска
    private GregorianCalendar dateOfLastVocation;      // дата последнего отпуска
    private String department;                         // отдел в котором работае сотрудник


    public Humans(){
        setId(getId() + 1);
        this.idNumber = id;
        Scanner in = new Scanner(System.in);
        dateOfbirth = new Date();
        System.out.println("Введите ваше имя:");
        this.setName((in.nextLine()));
        System.out.println("Введите вашу фамилию:");
        this.setSurName((in.nextLine()));
        /*System.out.println("Введите ваше отчество");
        this.setMiddleName((in.nextLine()));
        System.out.println("Ваш пол?");
        this.setSex((in.nextLine()));
        System.out.println("Введите день вашего рождения: ");
        dateOfbirth.setDate(in.nextInt());
        System.out.println("Введите месяц вашего рождения: ");
        dateOfbirth.setMonth(in.nextInt()-1);
        System.out.println("Введите год вашего рождения: ");
        dateOfbirth.setYear(in.nextInt()-1900);
        */
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Humans.id = id;
    }


    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getSumDaysForVocation() {
        return sumDaysForVocation;
    }

    public void setSumDaysForVocation(int sumDaysForVocation) {
        this.sumDaysForVocation = sumDaysForVocation;
    }

    public GregorianCalendar getDateOfLastVocation() {
        return dateOfLastVocation;
    }

    public void setDateOfLastVocation(GregorianCalendar dateOfLastVocation) {
        this.dateOfLastVocation = dateOfLastVocation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void showAll(){
        System.out.println("Раб№ " + idNumber + ", ФИО " + name + " " + surName);

    }
    public void sell(){

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
