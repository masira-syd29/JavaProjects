import java.util.*;

public class Accenture1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe pf the array: ");
        int arrsize = sc.nextInt();
        int[] main = new int[arrsize];
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        System.out.println("Enter " + arrsize + " Elements");
        for(int i=0; i<arrsize; i++) {
            main[i] = sc.nextInt();
        }
        for(int i=0; i<arrsize; i++) {
            if(i%2 == 0) {
                even.add(main[i]);
            } else {
                odd.add(main[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Sorted even array ");
        for(int e:even) {
            System.out.print(e + " ");
            System.out.println();
            System.out.print("sorted odd array");
        }
        for(int e:odd) {
            System.out.print(e + " ");
            System.out.println();
        }
        int evensec = even.get(even.size()-2);
        int oddsec = odd.get(odd.size()-2);
        System.out.println("Second largest element int the Even list is : " + evensec);
        System.out.println( "Second largest element int the odd list is : " + oddsec);
        System.out.println("Sum of second largest element of odd and even list:"+ (evensec+oddsec));
    }
}
