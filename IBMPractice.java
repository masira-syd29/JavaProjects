
import java.util.Scanner;

public class IBMPractice {
    //Program to find HCF of two numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }

    // Function to find HCF without using recursion
    private static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

