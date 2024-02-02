package src_OOPS_21JAN;
import java.util.Enumeration;
import java.util.Vector;

public class LAB185 {
    public static void main(String[] args) {


        Vector<String> v2 = new Vector();
        v2.add("swathi");
        v2.add("phani");
        v2.add("school");

        Enumeration e = v2.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
