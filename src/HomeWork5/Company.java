package HomeWork5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;


public class Company implements Serializable {
    private ArrayList<Humans> list;                   // список сотрудников
    private double companyAccount;                     // счет компании


    public Company() {
          list = new ArrayList<Humans>();
    }


    public ArrayList<Humans> getList() {
        return list;
    }

    public void setList(ArrayList<Humans> list) {
        this.list = list;
    }

    public double getCompanyAccount() {
        return companyAccount;
    }

    public void setCompanyAccount(double companyAccount) {
        this.companyAccount = companyAccount;
    }


    public void newWorker(){
        Humans human = new Workers();
        list.add(human);

    }
    public void newSeller(){
        Humans human = new Sellers();
        list.add(human);
}
    public void newManager(){
        Humans human = new Manager();
        list.add(human);
    }
    public void showAll(){
        for (int i = 0; i < list.size(); i++){
            list.get(i).showAll();
        }
    }
    public void sell(){

    }
}
