package src.oops.basic.basics;

public class LAB133 {
    public static void main(String[] args) {

        String s1 = "Swathi";
        String s2 = new String("Swathi");

        StringBuilder sb3 = new StringBuilder("Swathi");
        sb3.append("kumar");
        System.out.println(sb3);

        StringBuffer sb = new StringBuffer("Swathi");
        sb .append("world");
        System.out.println(sb);
    }
}
