package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[] args) {
        double driven;
        double fuel;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the miles driven :");
        driven = input.nextInt();
        System.out.print("Enter the fuel used:");
        fuel = input.nextInt();
        double milesPerGallon = driven / fuel;
        System.out.println("Your car's Miles per gallon is "+milesPerGallon +"mpg");

    }
}
