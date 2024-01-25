package src_OOPS_14JAN_EXCEPTIONS;

public class LAB167 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int x = 10 / a;
        } catch (Exception e){
            System.out.println("Exit");
            System.exit(0);
        } finally {
            System.out.println("I am final");
        }
    }
}
