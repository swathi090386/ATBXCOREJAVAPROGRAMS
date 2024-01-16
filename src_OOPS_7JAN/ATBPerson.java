package src_OOPS_7JAN;

public class ATBPerson {
    String name; //instance variable are default
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    //default constructors
    ATBPerson(){
        courseName = "ATB";
        System.out.println("I am Default!");
    }

    //param constructor
    ATBPerson(String valuefromObjectRef){
        this.name = valuefromObjectRef;
    }


    void talk(){
        System.out.println("talk!!");
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(this.courseName);
    }
}
