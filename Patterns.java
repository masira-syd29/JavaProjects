public class Patterns {
    public static void main(String[] args) {
        /**Print a Solid RECTANGLE
        int n = 4;
        int m = 5;
        //outer loop for Nested loops
        for(int i=1; i<=4; i++){
            //inner loop
            for(int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        //Print a Halo Rectangle
        /**int n = 4;
        int m =5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++) {
                //cel -> (i,j)
                if(i == 1 || j == 1 || i == n || j ==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


        //Print half Pyramid
        /**int n = 4;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        
        //Print half Pyramid Inverted
        /**int n = 4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        } */


        //Print half pyramid right Alligned
        int n = 4;
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //inner loop starprint
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
