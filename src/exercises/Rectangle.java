package exercises;
import  java.util.Scanner;
public class Rectangle {
    public static void main (String[] args) {
        double length;
        double width;

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the length of rectangle:");
        length = input.nextDouble();
        System.out.println(" Enter the width of rectangle:");
        width = input.nextDouble();
        input.close();
        double area = length * width;
        System.out.println("Area of rectangle :"+area);
    }
}
