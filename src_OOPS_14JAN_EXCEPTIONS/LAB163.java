package src_OOPS_14JAN_EXCEPTIONS;

public class LAB163 {
    public static void main(String[] args) {
        String sh = args[0]; // 1// 5,15 -> string 5 ->java.lang.ArrayIndexoutof bondsException
        int x = Integer.parseInt(sh); // 2 -> java.lang.numberformatException swathi-> int
        int a = 10/x; //3 - java.lang.ArithmeticExceptions

        System.out.println(x);
        System.out.println(a);
    }
}

// jvm will be initialized
// creates and starts the main thread

//main thread will do the following tasks
// 1) collects the command line arguments
// 2) creates the string array with CLA
// 3) CALLS main method by passing string array as Parameter:
// LAB163.main(5,15);
//now conrol will be transfered from main thread to main method

//control will come back to main thread in two ways.
//a) when problem comes in main -> JVM
// Creates the object of identified exception class
//Exception a =new Exception ()
