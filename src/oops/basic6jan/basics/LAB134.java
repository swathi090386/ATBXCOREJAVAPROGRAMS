package src.oops.basic6jan.basics;

public class LAB134 {
    public static void main(String[] args) {

        // immutable in nature (that cant be changed)
        String password = "pass@123";

        // 1000 times iam going to change the password value
        //should i use the Sb , sb or string

        // mutable - tht can be changed !!

        // StringBuffer sb4 = new StringBuffer("Swathi");

        StringBuilder password2 = new StringBuilder("swathi");
        password2 .append("world");
        System.out.println(password2);

    }
}
