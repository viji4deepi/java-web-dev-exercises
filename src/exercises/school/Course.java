package exercises.school;
import exercises.Student;

import java.util.*;

public class Course {
    public static void main (String[] args) {
        HashMap<Integer,Student> studentInfo = new HashMap<>();
        Student s1 = new Student("Narayana",121,2,3.1);
        Student s2 = new Student("Rahul",111,2,3.4);
        studentInfo.put(1,s1);
        studentInfo.put(2,s2);
        Iterator trav = studentInfo.entrySet().stream().iterator();

        System.out.println("The student record are :");
        while (trav.hasNext()) {
            Map.Entry record = (Map.Entry)trav.next();
            Student j = (Student)record.getValue();
            System.out.println("Name: "+j.getName() +", Student id: "+j.getStudentId() +", Credits: "+j.getNumberOfCredits() +", GPA :"+j.getGpa() );
        }
    }
}
