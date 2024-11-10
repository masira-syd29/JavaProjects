public class Patterns2 {
    public static void main(String[] args) {

        /**Half Pyramid with numbers 
        int n = 5;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        } */

        /**Half pyramid with numbers Inverted 
        int n = 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        } */


        /** Half pyramid with numbers increasing 
        int n = 5;
        int number = 1;
        //outer Loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(number+" ");
                number++;//number+1
            }
            System.out.println();

        } */


        /*Half pyramid with binary numbers */
        int n = 5;
        
        //outer Loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++) {
                int sum = i+j;
                if(sum % 2 == 0) {
                    System.out.print("1 "); //even
                } else {
                    System.out.print("0 "); //odd
                }
                
            }
            System.out.println();

        }
        
        
    }
}
