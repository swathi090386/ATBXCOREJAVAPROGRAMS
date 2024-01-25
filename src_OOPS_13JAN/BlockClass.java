package src_OOPS_13JAN;

public class BlockClass {
    { //instance initization block
        System.out.println("I am IIB");

    }

    BlockClass(){
        System.out.println("I am DC");
    }

    static { //Static initization block
        System.out.println("I am SIB");
    }

}
