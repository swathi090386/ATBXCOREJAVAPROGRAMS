package src.oops.basic6jan.oops;

public class LAB141 {
    public static void main(String[] args) {
        // PERSON - Class blueprint
        // P - Ref variable
        // new Person() - Object Real
        // oops concept

        PERSON P = new PERSON();
        P.name = "phani";
        System.out.println(P.name);

        PERSON P2 = new PERSON();
        P2.name = "vaishnav";
        System.out.println(P2.name);

        new PERSON();// object -> new Object
        // Person(); -> Method or Function
        PERSON P3 = null;
        System.out.println("end of the program");

        // p,p2 and p3 - Ref -
        // p -> Amit , p2 -> Pramod, p3 -> null


    }
}
