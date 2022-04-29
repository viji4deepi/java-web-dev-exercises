package exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListWords {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.print("Enter the word length for search:");
        var wordsLength = input.nextInt();
        // static method to print out each word in a list that has exactly 5 letters
        words.add("may");
        words.add("i");
        words.add("come");
        words.add("i");
        words.add("wait");
        words.add("welcome");
        words.add("closed");
        words.add("favor");
        for(var word: words) {
           // if(word.length() == 5) {
            if(word.length() == wordsLength) {
              System.out.println(word);
            }
        }
      //  System.out.println("Thw word length of the words is not found!");

        //2nd approach to get the string to array and split the words.Print the word length of 5
        String message = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsSplit = message.split(" ");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(wordsSplit));
        System.out.println("\nThe output for string to Array approach :");
        for(String s : strList) {
            if(s.length() == wordsLength) {
                System.out.println(s);
            }
        }
      //  System.out.println("Thw word length of the words is not found!");
    }
}
