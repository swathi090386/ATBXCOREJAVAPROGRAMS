package src_OOPS_14JAN_EXCEPTIONS;

public class LAB162 {
    public static void main(String[] args) {
        try{
            String name = null;
            name.trim(); // 100GB USED! Stackovererror
            System.out.println("iam swathi");
        } catch (Exception e) {
            System.out.println("you are trying to trim a null string that is no longer error");
        }
        System.out.println("HI Iam the End");
    }
}

//Exeception ->
// event that occours during the execution of a program
// that disrupts the normal flow of instructions.