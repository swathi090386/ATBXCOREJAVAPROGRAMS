package src.basic03;

public class LAB027 {
    public static void main(String[] args) {
        // casting  - mold
        // widening is the process of converting lower type to higher type
        byte b = 10;
       // int a = b; // implicit casting - jvm
        int a = (int) b; // explicit casting -jvm

        // Narrowing is the process of converting higher type to lower type
        int a1 = 300;
        // byte b1 = a1; //  Invalid - implicit casting
        byte b1 = (byte) a1;  // explicit casting
        System.out.println(b1);

        // 32 bits
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
        // 0 0  1 0 1 1 0 0
        // 32 bit value = 44 (last 8 bit value need to be considered)
        // 44

    }
}
