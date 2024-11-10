import java.util.*;
public class IBMExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ch1[] = new int[255];
        for(int i=0; i<s.length(); i++) {
            ch1[s.charAt(i)]+=s.charAt(i+1)-'0';
            i++;
        }
        String ans="";
        char ch2=32;
        for (int i=0; i<ch1.length; i++) {
            if(ch1[i]!=0) {
                ch2=(char)i;
                ans=ans+ch2+ch1[i];
            }
        }
        System.out.println(ans);
    }

    
}
