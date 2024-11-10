import java.util.Scanner;

public class HackerRank6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();

       for(int i=1; i<=10; i++) {
        int results = N*i;
        System.out.printf("%d x %d = %d\n", N, i, results);
       }
    }
}
