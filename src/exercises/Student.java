package exercises;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private static int nextStudentId = 1;

    public Student (String name,int studentId,int numberOfCredits,double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0.0);
    }

    public  Student(String name) {
        this(name,nextStudentId);
        nextStudentId ++;
    }

    //method

    public String getName() {
        return  name;
        }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int newStudentId) {
        this.studentId = newStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int newNumberOfCredits) {
        this.numberOfCredits = newNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public  String studentInfo() {
        return (this.name +"has a GPA of: "+this.gpa);
    }

    public  void addGrade(int courseCredits, double grade) {
        //update the appropriate fields: numberOfCredits, gpa
    }

    public void getGradeLevel() {
        //determine the grade level of the student based on numberOfCredits
        return ;
    }
//     @Override
//    public String toString() {
//        return  ("The student name is: "+this.getName() +"\nStudent id: "+this.getStudentId() +"\n Credits:" +this.getNumberOfCredits()+ "\n GPA:"+this.getGpa());
//     }
//
//     public static void main(String[] args) {
//        Student studentRecord = new Student("Tuffy",23,1,4);
//        System.out.println(studentRecord.toString());
//     }
}
