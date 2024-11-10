import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 10: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Invalid input. Number must be between 1 and 10.");
        } else {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
        scanner.close();
    }
}

