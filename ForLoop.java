import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /**counter++ => counter = counter +1*/
       /**for(int counter = 0; counter < 11; counter++) {
        System.out.println(counter+"  ");*/

        /**for(int i= 0; i < 11; i++){
            System.out.println(i+);
        } */
        
        
        //Sum of n natural numbers
       /**Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int sum = 0;
       for(int i=0; i<=n; i++) {
        sum = sum + i;
       }
       System.out.println(sum);*/


       /**  Print the whole table of a number
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();

       for(int i=1; i<11; i++) {
        System.out.println(i*n);
       }*/

       //Print if a number is prime or not
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       boolean isPrime = true;
       for(int i=2; i<=n/2; i++)  {
        if (n % i == 0) {
            isPrime = false;
            break;
        }       
        }
        if(isPrime) {
            if(n == 1) {
                System.out.println("This is neither Prime nor Composite");
            } else {
                System.out.println("This is a Prime number");
            } 
        } else {
            System.out.println("This is not a Prime Number");
        }
    }
}
