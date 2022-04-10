package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main (String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        while(!valid) {

            System.out.print("Enter the radius of circle:");
            radius = input.nextDouble();
            // double pi = 3.14;
            //double area = pi * radius *radius;
            if(radius >= 0) {
                valid = true;
                double area = Circle.getArea(radius);
                System.out.println("The area of circle is :"+area);
            } else if (radius < 0) {
                System.out.println("You have entered an negative number");
            } else {
                System.out.println("You have entered an Empty string");
            }

        }
    }
}
