import java.util.Scanner;

public class ArraysExercise {
    //Take an array of names as input from the user and print them on the screen.
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];

        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }

        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) + " is: " + names[i]);
        }
    } */

    //Find the maximum & minimum number in an array of integers.[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {

                max = numbers[i];
 
            }

        }
        System.out.println("Largest Number is : " + max);
        System.out.println("Smallest Number is : " + min);

    } */

    //Take an array of numbers as input and check if it is an array sorted in ascending order.Eg : { 1, 2, 4, 7 } is sorted in ascending order.{3, 4, 6, 2} is not sorted in ascending order.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                isAscending = false;
            }
        }

        if(isAscending) {

            System.out.println("The array is sorted in ascending order");
 
        } else {
            System.out.println("The array is not sorted in ascending order");

       }
    }
}
