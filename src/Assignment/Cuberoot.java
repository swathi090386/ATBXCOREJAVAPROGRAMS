package src.Assignment;

import java.util.Scanner;

public class Cuberoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x :");
        double x = sc.nextDouble();


        System.out.println("enter the value of y :");
        double y = sc.nextDouble();


        System.out.println("enter the value of z :");
        double z = sc.nextDouble();

        // Calculate the cuberoot of (x^2 + y^2 - |z|)

        double result =Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));

        // print the result

        System.out.println("Cuberoot of (x^2 + y^2 - |z| is :" +result);



    }
}
