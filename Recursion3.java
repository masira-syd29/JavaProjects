import java.util.*;
import java.util.ArrayList;

public class Recursion3 {

    //print all the permutations of string
    /*public static void printPermutation(String str, String permutation) {

        if(str.length() == 0) {
            System.out.println(permutation);
        }
        for(int i=0; i<str.length(); i++) {
            char curChar = str.charAt(i);

            //ab --> ab

            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, permutation+curChar);
        }
        
    }

    public static void main(String[] args) {
        String str = "Sahal";
        printPermutation(str, "");
    } */

    //count total path in a maze to move from (0,0) to (n,m)
    /*public static int countPaths(int i, int j,int n, int m) {

        if(i == n || j == m) {
            return 0;
        }

        if(i == n-1  && j == m-1) {
            return 1;
        }

        //move downwars
        int downPaths = countPaths(i+1, j, n, m);

        //move right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
        
    }


    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m); 
        System.out.println(totalPaths);
    } */

    //place tiles of size 1xm on a floor of size nxm

    /*public static int placetiles(int n, int m) { 

        if(n == m) {
            return 2;
        } 
        if(n < m){
            return 1;
        }
        //vertically
        int vertPlacements = placetiles(n-m, m);

        //horizaontally
        int hortPlacements = placetiles(n-1, m);

        return vertPlacements + hortPlacements;
        
    }
    public static void main(String[] args) {
      int n = 4, m = 2;
      System.out.println(placetiles(n, m));  
    } */

    //find the number of ways in which you can int invite  n people to your party single or in pairs
    /*public static int choosePartner(int n) { 
        if(n <= 1) {
             return 1;
        }
        int ways1 = choosePartner(n-1);

        int ways2 = (n-1) * choosePartner(n-2);

        return ways1 + ways2;
        
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(choosePartner(n));
    } */

    //print all teh subsets of set of all n natural numbers

    public static void findSubset(ArrayList<Integer> subset) {
        for(int i=-0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
            
        }
        System.out.println();
    }
    
    public static void printSubset(int n, ArrayList<Integer> subset) {

        if(n == 0) {
            findSubset(subset);
            return;
        }

        //choice to be added
        subset.add(n);
        printSubset(n-1, subset);

        //choice to not be included
        subset.remove(subset.size()-1);
        printSubset(n-1, subset);
        
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        printSubset(n, subset);
        
    }
}
