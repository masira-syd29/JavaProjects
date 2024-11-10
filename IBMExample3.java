import java.util.Scanner;

public class IBMExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        s = new String(sb);
        int n = Integer.parseInt(s);
        int rem = 0;
        double dec = 0;
        int i = 0;
        while(n>0) {
            rem = n%10;
            dec = dec + rem * Math.pow(2,i);
            i++;
            n = n/10;
        }
        int ans = (int)dec;
        System.out.println(ans);
    }
    
}
