package src.basic04;
import java.util.Scanner;

public class LAB050 {
    public static void main(String[] args) {
        // if else
        // yes, no
        if(true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if(true){
            System.out.println("Only If");
        }

        // what If - number -> > 20, < 20 , < 10 ->
        // if , else if , else

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if( number > 20) {
            System.out.println("Number is > 20");
        }
        else if (number > 10){
            System.out.println("Number is > 10");
        } else {
            System.out.println("Number is < 20");
        }

    }
}
