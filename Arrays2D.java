import java.util.Scanner;
public class Arrays2D {
    /*public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int [][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    } */

    //Take amatrix as input fromthe user search for given number x and print the indices at which it occurs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int [][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(numbers[i][j] == x) {
                    System.out.println("X found at location: (" + i + "," + j + ")");
                }
            }
        }
    }
}
