package src.oops.basic.basics;

import java.util.Scanner;

public class LAB137 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string, i wil check for Palindrome");
        String user_input = scanner.next();
        user_input = user_input.toLowerCase();
        boolean result = isPalindrome(user_input);
        if(result) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");

        }


    }
private static boolean isPalindrome(String userInput) {
        String original_str = userInput; //swathi , naman
    StringBuilder sb = new StringBuilder(userInput);
    String reverse_string = sb.reverse().toString(); //ihtaws ,naman
    return original_str.equalsIgnoreCase(reverse_string); //ihtaws
    }
}