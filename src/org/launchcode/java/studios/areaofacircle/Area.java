package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        try {
             while (!valid) {

                     System.out.print("Enter the radius of circle:");
                     radius = input.nextDouble();

                     // double pi = 3.14;
                     //double area = pi * radius *radius;
                     if (radius >= 0) {
                         valid = true;
                         double area = Circle.getArea(radius);
                         System.out.println("The area of circle of radius " + radius + " is :" + area);
                     } else {
                         valid = false;
                         System.out.println("You have entered an negative number");
                     }
                 }
                 } catch (Exception error) {

                     System.out.println("Provide an numeric input");
             }
            //close input
        input.close();
    }
}
