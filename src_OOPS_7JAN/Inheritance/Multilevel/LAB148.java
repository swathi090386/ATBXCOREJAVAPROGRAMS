package src_OOPS_7JAN.Inheritance.Multilevel;

public class LAB148 {
    public static void main(String[] args) {
      //  GrandFather g = new GrandFather();
      //  Father f = new Father();
      //  Son S = new Son();

       // GrandFather g = new Son();
        //Father f = new Son();
       // Son s = new GrandFather();
        // Son S = new Father();

        // Son s = new Son();

        GrandFather g = new Son();
        g.bhk3();

        Son s = new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();


    }
}
