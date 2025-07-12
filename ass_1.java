// Omar Mohamed Suliman Mohamed
// ass 1

import java.util.Scanner;
public class ass_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age in years: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your favorite programming language: ");
        String language = input.nextLine();

        int ageInMonths = age * 12;

        System.out.println("\nHello! My name is " + name);
        System.out.println("I am " + age + " years old, which is " + ageInMonths + " months");
        System.out.println("My favorite programming language is " + language);
        age++;
        System.out.println("Next year I will be " + age + " years old");
        //input.close();
    }
}
