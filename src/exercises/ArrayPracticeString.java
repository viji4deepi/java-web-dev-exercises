package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class ArrayPracticeString {
    public static void main (String[] args) {
        String message = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
       String[] words = message.split("\\W+");
        for (int i = 0; i < words.length; i++) {
       // System.out.println(words[i]);
        }
        // using array list collections
        String[] wordsSplit = message.split(" ");

    ArrayList<String> strList = new ArrayList<>(Arrays.asList(wordsSplit));
        for(String s : strList) {
            System.out.println(s);
        }
      //  System.out.println(Arrays.toString(arrayName));
    }
}
