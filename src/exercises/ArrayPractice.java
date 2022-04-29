package exercises;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for(int i : numbers) {
            if ( i %2 == 1) {
                System.out.println(i);
            }
        }
    }
}
