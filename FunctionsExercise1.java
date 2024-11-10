import java.util.Scanner;

public class FunctionsExercise1 {
    //program to enter the number till the user wants and in the end it should display the count of positive, negatives and zeros entered
    /**public static void main(String[] args) {
        int positive = 0, negative = 0, zeros = 0;
        System.out.println("Press 1 to continue and 0 to stop"); 
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input == 1) {
            System.out.println("Enter your Number: ");
            int number = sc.nextInt();

            if(number > 0) {
                positive++;
            } else if(number < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Press 1 to continue and 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positive :" + positive);
        System.out.println("Negative :" + negative);
        System.out.println("Zeros :" + zeros);
    } */

    //two numbers are entered by the user x and n, write a function to find the value of one number raised to the power of another
    /**public static void main(String[] args) {
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int result = 1; //please see that n is not too large or else result will exceed te size of int
        for(int i=0; i<n; i++) {
            result = result * x;
        } 
        System.out.println("X to the power n is : " + result);
    } */

    //program to find fibonacci series, a number is the sum of the previous
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a + " ");

        if(n > 1) {
            for(int i=2; i<=n; i++) {
                System.out.println(b + " ");

                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }
}
