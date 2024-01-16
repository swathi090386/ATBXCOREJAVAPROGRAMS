package src.oops.basic6jan.basics;

public class LAB132 {
    public static void main(String[] args) {

        String s1 = "Swathi";
        String s2 = new String("Swathi");
        String s3 = new String("Swathi");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
