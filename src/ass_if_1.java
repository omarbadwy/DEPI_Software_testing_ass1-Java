// Omar Mohamed Suliman Mohamed
// ass if 1

import java.util.Scanner;
public class ass_if_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check even or odd
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        input.close();
    }
}
