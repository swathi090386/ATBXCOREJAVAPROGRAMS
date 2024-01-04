package src.basic03;

public class LAB041 {
    public static void main(String[] args) {
        // Increment operator
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // part - A ( Exp = 11, a = 11 ) -> ++a -> 11
        // part - B ( Exp = 11, a = 12 ) -> a++ -> 11
        // Part - c ( Exp = 12, a = 13 ) -> a++ -> 12
        // A+B+C -> 11+11+12 ->34, a -> 12
    }
}
