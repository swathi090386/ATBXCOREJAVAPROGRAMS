package src.basic03;

public class LAB033 {
    public static void main(String[] args) {
        String name = "the testing";
        String name1 = "the testng";
        String name2 = new String("the testing");

        // System.out.println(name == name1);
       // System.out.println(name.equals(name1));

        // System.out.println(name == name2);

        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

    }
}
