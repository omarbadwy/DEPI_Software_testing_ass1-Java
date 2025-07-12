// Omar Mohamed Suliman Mohamed
// ass Switch

import java.util.Scanner;
public class ass_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter your grade : ");
        char grade = input.next().toUpperCase().charAt(0);

        // Switch to determine feedback
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

        input.close();
    }
}
