package src.basic03;

import java.util.Scanner;

public class LAB048 {
    public static void main(String[] args) {

        // take three input from user and give max out of two numbers
        // a,b a>b -> a, else b

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a > b) {
            System.out.println("Max ->" +a);
        }
        else {
            System.out.println("Max ->" +b);
        }




    }
}
