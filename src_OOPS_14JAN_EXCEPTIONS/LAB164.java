package src_OOPS_14JAN_EXCEPTIONS;

import java.io.File;
import java.io.FileInputStream;

public class LAB164 {
    public static void main(String[] args) {
// unchecked exception ,runtime
        String name = null;
        name.trim(); // unchecked ?runtime

        //checked exception ,compile time -> JVM
        try {
            FileInputStream f = new FileInputStream("dasd.txt");
        } catch (Exception e) {
        }

    }
}