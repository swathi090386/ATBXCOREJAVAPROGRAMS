package src_OOPS_14JAN;

public class StaticDemo {
    public static String college_name = "TheTestingAcedemy";

    public int version = 3;

    public static void printName(){
        int age = 40;
        System.out.println("Name is :" + college_name);
    }

    public void printVersion(){
        int age = 40;
        System.out.println("Version is :" + version);
        System.out.println("Name is :" + college_name);

    }
}

