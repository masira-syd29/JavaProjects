import java.util.Scanner;

public class Arrays2DPracticeExcercise {
    //Print the spiral order matrix as output for a given matrix of numbers.
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The spriral order matrix is: ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(col=colStart; col<=colEnd; col++) {
                System.out.println(matrix[rowStart][col] + " ");
            }
            rowStart++;
            for(row=rowStart; row<=rowEnd; col++) {
                System.out.println(matrix[row][colEnd] + " ");
            }
            colEnd--;
            for(col=colEnd; col>=colStart; col--) {
                System.out.println(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
            for(row=rowEnd; row>=rowStart; row--) {
                System.out.println(matrix[row][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }

    } */
    
    //For a given matrix of N x M, print its transpose.

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int m = sc.nextInt();


      int matrix[][] = new int[n][m];

      for(int i=0; i<n; i++) {

           for(int j=0; j<m; j++) {

               matrix[i][j] = sc.nextInt();

           }

      }


      System.out.println("The transpose is : ");

      //To print transpose

      for(int j=0; j<m ;j++) {

          for(int i=0; i<n; i++) {

              System.out.print(matrix[i][j]+" ");

          }

          System.out.println();

      }

   }

}
