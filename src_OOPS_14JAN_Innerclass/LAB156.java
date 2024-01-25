package src_OOPS_14JAN_Innerclass;

public class LAB156 {
    public static void main(String[] args) {

        Thread t=  new Thread(){
            @Override
            public void run(){
                System.out.println("I am a THREAD!");
            }
        };
        t.run();

    }
}
