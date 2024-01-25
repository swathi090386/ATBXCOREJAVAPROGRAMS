package src_OOPS_20JAN;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LAB175 {
    public static void main(String[] args) {
        String path = "C:/a.txt";
        try {
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
