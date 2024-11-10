public class Recursion1 {

    //print 5 to 1
    /*public static void printNumb(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        printNumb(n-1);
        
    }
    public static void main(String[] args) {
        int n= 5;
        printNumb(n);

    } */

    //print number 1 to 5
    /*public static void printNumb(int n) {
        if(n == 6) {
            return;
        }

        System.out.println(n);
        printNumb(n+1);
        
    }
    public static void main(String[] args) {
        int n= 1;
        printNumb(n);

    } */

    //print sum of n natural numbers
    /*public static void printSum(int i, int n, int sum) {
        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        
        printSum(i+1, n, sum);
        System.out.println(i);
        
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    } */


    //print factorial of a number
    /*public static int calcfactorial(int n) {
        if(n == 1 || n ==0) {
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    } */

    //print the fibonacci sequence till nth term
    /**public static void printFibonacci(int a, int b, int n) { //a--> second last term, b-->  last term
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFibonacci(a, b, n-2);
    } */

    //print x^n (stack height=n)
   /* public static int calcPower(int x, int n) {
        if(n == 0){  //base case1 
            return 1;

        } 
        if(x == 0) { //base case 2
            return 0;
        }
        int xPowernm1 = calcPower(x, n-1); //calc x^n-1
        int xPowern = x * xPowernm1;
        return xPowern;
        
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    } */


    //print x^n (stack height = logn)
    public static int calcPower(int x, int n) {
        if(n == 0){  //base case1 
            return 1;

        } 
        if(x == 0) { //base case 2
            return 0;
        }
        if(n % 2 == 0) { //n is even
            return calcPower(x, n/2) * calcPower(x, n/2);
        } else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
        
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
