package Lesson12.Task1;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/29/13
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindException {
    private String str;
    private String str1;
    private String str2;

    public FindException() {
        this.setStr("123");
        this.setStr1("123ee");
        this.setStr2(null);

    }

    public boolean exception() {
        if (getStr2() == null) {
                throw new NullPointerException();
        }
        try {
            Integer.valueOf(this.getStr2());
        } catch (NumberFormatException e) {
            System.out.println(false);
            //e.printStackTrace();
            return false;

        }
        System.out.println(true);
        return true;

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
