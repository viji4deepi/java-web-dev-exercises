package exercises;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapPractice {
    public static void main (String[] args) {
    HashMap<Integer,String> students= new HashMap<>();
    Scanner input = new Scanner(System.in);
    String newStudent;

    System.out.println("Enter the Students (or ENTER to finish):");
    // Get student names and grades
        do {
            System.out.print("Student:");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.print("Id:");
                Integer newId = input.nextInt();
                students.put(newId,newStudent);

                input.nextLine();
            }
        }while(!newStudent.equals(""));

        //print the key : id and values :names
        System.out.println("The student id and names are :");
        for(Map.Entry<Integer,String> student : students.entrySet()) {

           System.out.println(student.getKey() +":"+student.getValue());
        }
    }
}
