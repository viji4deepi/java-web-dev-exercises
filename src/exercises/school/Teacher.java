package exercises.school;

import exercises.Student;

public class Teacher {
   private String firstName;
   private String lastName;
   private String subject;
   private int yearsTeaching;

   public Teacher(String firstName,String lastName, String subject, int yearsTeaching) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.subject = subject;
       this.yearsTeaching = yearsTeaching;
   }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void setYearsTeaching(int newYearsTeaching) {
        this.yearsTeaching = newYearsTeaching;
    }
}
