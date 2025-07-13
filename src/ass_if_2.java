// Omar Mohamed Suliman Mohamed
// ass if 2

import java.util.Scanner;
public class ass_if_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // consume the newline

        System.out.print("Enter your nationality: ");
        String nationality = input.nextLine();

        // Check eligibility
        if (age >= 18 && nationality.equalsIgnoreCase("Egyptian")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }

        input.close();
    }
}
