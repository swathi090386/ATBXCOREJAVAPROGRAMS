package src_OOPS_14JAN;

public class LAB150 {
    public static void main(String[] args) {
        System.out.println(StaticDemo.college_name);
        StaticDemo.printName();

        StaticDemo s1 = new StaticDemo();
        s1.version = 199;
        s1.printVersion();

        StaticDemo.college_name = "TTA";

        StaticDemo s2 = new StaticDemo();
        s2 .version = 200;
        s2.printVersion();
    }
}
