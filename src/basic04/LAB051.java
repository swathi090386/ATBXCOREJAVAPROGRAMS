package src.basic04;

import java.util.Scanner;

public class LAB051 {
    public static void main(String[] args) {
        // 1.input user
        //score(data type) -> int -> Grade(char or string)
        // DAA - Ask for the confirmation of the doubts

        //2.Basic login or brute force logic write basic rough code
        //if score >= 90 && score <=100 -> print A
        // ELSE IF SCORE >= 80 && SCORE 89 <= 100 -> print B

        //3. Write the real code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();
        char grade = 'F';
        if(score >= 90 && score <= 100){
            System.out.println("Your score -> A");
        } else if(score >= 80 && score <= 89) {
            System.out.println("Your score -> B");
        } else if(score >= 70 && score <= 79) {
            System.out.println("Your score -> C");
        } else if(score >= 60 && score <= 69) {
            System.out.println("Your score -> D");
        } else {
            System.out.println("Your score -> F");
        }

        //4.DEBUG THE CODE
       // 5.FIX THE CODE AND FINAL IT
    }
}
