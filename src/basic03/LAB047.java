package src.basic03;
import java.util.Scanner;
public class LAB047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number , i will tell if it is even/odd");
        int a = sc.nextInt();

        if(a%2 ==1){
            System.out.println("odd number");
        }
        else {
            System.out.println("even number");
        }
    }
}
