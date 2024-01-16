package src.oops.basic6jan.basics;


public class LAB136 {
    public static void main(String[] args) {

     // if something is Thread safe ,we avoid!
     // StringBuffer VS StringBuilder

     StringBuilder stringBuilder = new StringBuilder("swathi");
     stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
