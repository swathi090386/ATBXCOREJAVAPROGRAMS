package src.oops.basic.basics;

public class LAB131 {
    public static void main(String[] args) {

        String name = "swathi";
        System.out.println(name.concat("kumar"));
        System.out.println(name + "kumar");
        System.out.println(name.contains("a"));
        System.out.println(name);

        String name2 = new String("kumar");

      String expected_result = "password@123";
      String actual_result = "Password@123";
      if (expected_result.equalsIgnoreCase(actual_result)){
          System.out.println("Yes");
      }
    }
}
