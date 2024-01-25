package src_OOPS_20JAN;

public class LAB170 {
    public static void main(String[] args) {

        // extracted(10);
        extracted(0);
    }

    private static void extracted(int b) {
       // int a;
        //if (b==0){
          //  throw new ArithmeticException("B can't be zero");
        //}else{
          //  a = 10 / b;
        //}
        //System.out.println(a);
        try {
            int a = 10 / b;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
