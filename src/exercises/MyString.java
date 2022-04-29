package exercises;
import  java.util.Scanner;
public class MyString {

    static boolean isWordPresent(String sentence,String word) {
        word = transform(word);
        sentence = transform(sentence);

        String[] s = sentence.split(" ");
        for(String temp : s) {
            if (temp.compareTo(word) == 0 ){
                return true;
            }
        }
        return false;
    }

    static String transform(String word) {
        return word.toUpperCase();
    }

        public static void main (String[] args) {
            String str_Sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
            Scanner input =new Scanner(System.in);
            System.out.print("Enter a word : ");
            String word = input.nextLine();

           if(isWordPresent(str_Sentence,word)) {
               System.out.println("The index of the word is "+str_Sentence.indexOf(word));
               System.out.println("The length of the word is "+word.length());
               System.out.println("The word is found");
           } else {
               System.out.println("The word is not found");
           }
        }

}
