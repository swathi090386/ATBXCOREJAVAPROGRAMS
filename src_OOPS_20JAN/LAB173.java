package src_OOPS_20JAN;

import java.io.File;
import java.io.FileReader;

public class LAB173 {
    public static void main(String[] args) {
        int a = 10/0; // unchecked - JVM dont know?
        //checked
        try {
            FileReader f = new FileReader(new File("c://a/txt"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
