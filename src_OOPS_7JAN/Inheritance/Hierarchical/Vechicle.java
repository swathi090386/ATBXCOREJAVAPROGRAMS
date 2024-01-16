package src_OOPS_7JAN.Inheritance.Hierarchical;

public class Vechicle {

    Vechicle(){
        System.out.println("DC Vehicle");
    }

    void vehicalHasTopSpeed(){
        System.out.println("Yeah from " +getClass().getSimpleName());
    }
}
