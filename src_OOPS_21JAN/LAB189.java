package src_OOPS_21JAN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LAB189 {
    public static void main(String[] args) {
        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(91);
        myMarks.add(87);
        myMarks.add(80);
        Collections.sort(myMarks);
        System.out.println(myMarks);



        Student student = new Student(1,"swathi");
        Student student2 = new Student(10,"chow");
        Student student3 = new Student(3,"vaishnu");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        // Comparable -> 1 id or name not both are not allowed -

        Collections.sort(students);

        // Comparator - id, name
        // Create a class and implete comparator and tell the Interge
        System.out.println(students);
    }
}
