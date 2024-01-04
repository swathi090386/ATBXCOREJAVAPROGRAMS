package src.basic03;

public class LAB038 {
    public static void main(String[] args) {
        // Ternary Operator

        // int a = condition ? if this is true print do this : if false do this

        // MAX in two number?

        int a = 40;
        int b = 20;
        int c = 32;

        // -> ?
        // a > b && a > c -> a
        int max = (a > b) ? ((a > c) ? a :c) : ((b > c) ? b : c);
        System.out.println(max);
    }
}
