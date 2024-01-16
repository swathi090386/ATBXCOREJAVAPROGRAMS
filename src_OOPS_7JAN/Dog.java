package src_OOPS_7JAN;

public class Dog {

    String name; //instance variable

    Dog(){
        System.out.println("DC");
    }

    Dog(String nameRef){
           this.name = nameRef;
        System.out.println("PC");
    }


    void bark(){
        int age = 10; // local vaiable
        System.out.println("Bark");
        System.out.println("Dog name is -> "+ this.name);
    }

}
