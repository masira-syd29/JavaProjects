import java.util.Scanner;

public class IBMExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        StringBuffer sb = new StringBuffer();
        while(n>0) {
            rem = n%2;
            sb.append(rem);
            n = n/2;
        
        }
        sb.reverse();
        System.out.println(sb);
    }
}
