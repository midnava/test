package HomeWork5;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/25/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sellers extends Humans {

    private double resPay;                            // объем продаж

    public Sellers(){
        super();
        this.setWageRate(2000);

    }

    public double getResPay() {
        return resPay;
    }

    public void setResPay(double resPay) {
        this.resPay = resPay;
    }
    @Override
    public void sell(){
        this.resPay = resPay;
        this.setBonus(resPay / 5);


    }
}
