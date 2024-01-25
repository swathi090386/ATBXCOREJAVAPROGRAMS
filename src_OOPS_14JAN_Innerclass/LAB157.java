package src_OOPS_14JAN_Innerclass;

public class LAB157 {
    public static void main(String[] args) {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am THREAD!!");
            }
        };

    }
}