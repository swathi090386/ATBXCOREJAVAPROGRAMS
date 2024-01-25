package src_OOPS_14JAN_WrapperClass;

public class LAB161 {
    public static void main(String[] args) {

        int a = 10;
        Integer a2 =Integer.valueOf(a);
        // wrapper class we use in collection framework

        //Collection Framework -> Class -> Hate Primitive data type
        // you have to use the Wrapper classes in Collection

        Character ch = 'a';
        // unboxing -Character object to primitive conversion
        char a3 = ch;
        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(34,54));
        System.out.println(Integer.min(34,54));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double d = 90.87;
        String st2 = String.valueOf(d);
        Double st = Double.valueOf(d);
        int a22 = st.intValue();
        System.out.println(a22);


    }
}
