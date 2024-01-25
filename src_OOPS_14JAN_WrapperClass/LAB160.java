package src_OOPS_14JAN_WrapperClass;

public class LAB160 {
    public static void main(String[] args) {
        int x = 123;
        // String st1 = x;
        // String st1 = (String)x;

        String st1 = x+"";
        String s1 = String.valueOf(x);
        System.out.println(st1);
        System.out.println(s1);
    }
}
