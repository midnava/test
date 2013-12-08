package HomeWork5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Impovich
 * Date: 10/25/13
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Company foxtrot = new Company();
        ArrayList<Company> list = new ArrayList<Company>();
        foxtrot.newManager();
        //foxtrot.newManager();
        //foxtrot.showAll();
        //foxtrot.newSeller();

        System.out.println(Humans.getId());

    }


}


