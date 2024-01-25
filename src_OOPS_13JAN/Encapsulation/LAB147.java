package src_OOPS_13JAN.Encapsulation;

public class LAB147 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Swathi";
        s1.name = "Phani";

        //Getter and setter - condition based
        // they should be hidden

        PersonS personS = new PersonS();
        personS.id = 1;
        personS.id = 99;
        personS.id = -1;
        personS.bal = 999;

    }
}
