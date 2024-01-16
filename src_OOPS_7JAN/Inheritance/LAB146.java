package src_OOPS_7JAN.Inheritance;

public class LAB146 {
    public static void main(String[] args) {
        System.out.println();

        // what is inheritance?
        // inheritance provides a way to create a new class from an existing class
        // super class | parent class | base class
        // subclass | child class | derived class
        // the extends keyword

        // subclass extends the superclass{
        // content of subclass
        // }

        Programming p = new Programming(); //parent class /super class
        // how JVM understand this program

        // Programming - class
        // p -> ref to the Object
        // new Programming() -> object
        // DC is called

        p.printinfo();

        Programming p2 = new Programming("Perl" , 12);
        // how JVM understand this program

        // Programming - class - class loader
        // p2 -> ref to the Object
        // new Programming() -> object
        // param - constructor - called !!

              p2.printinfo();

    }
}
