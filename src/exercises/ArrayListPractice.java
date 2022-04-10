package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

       // This is for printing integers in array and print the even numbers

       Scanner input = new Scanner(System.in);

        System.out.print("Enter some Integers: ");
       int  integerValue = input.nextInt();
       while (integerValue != 0){
           list.add(integerValue);
           integerValue = input.nextInt();
        }

        for(int evenNo : list) {
            if(evenNo %2 == 0) {
                System.out.println("The even numbers are :"+evenNo);
            }
        }


    }
}
