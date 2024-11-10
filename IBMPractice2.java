
import java.util.Scanner;

public class IBMPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Fibonacci Triangle: ");
        int numRows = scanner.nextInt();

        generateFibonacciTriangle(numRows);

        scanner.close();
    }

    // Function to generate Fibonacci Triangle
    private static void generateFibonacciTriangle(int numRows) {
        int a = 0, b = 1;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }
    }
}

