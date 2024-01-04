package src.basic03;

public class LAB043 {
    public static void main(String[] args) {
        // Decrement operator
        int b = 10;
        System.out.println(--b + b--);
        System.out.println(b);

        //A -> --b - exp -> 9, b = 9
        // B -> b-- -> exp -> 9 , b -> 8
    }
}
