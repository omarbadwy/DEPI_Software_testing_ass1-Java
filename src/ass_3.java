// Omar Mohamed Suliman Mohamed
// ass 3

import java.util.Scanner;
public class ass_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Processing
        String upper = sentence.toUpperCase();
        int length = sentence.length();
        char firstChar = sentence.charAt(0);

        System.out.println("\nUppercase: " + upper);
        System.out.println("Length: " + length);
        System.out.println("First character: " + firstChar);

        input.close(); // Optional
    }
}
