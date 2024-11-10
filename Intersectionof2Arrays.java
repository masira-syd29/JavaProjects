import java.util.*;

public class Intersectionof2Arrays {
    public static int union(int arr1[], int arr2[]) { //O(n)
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++) {
            set.add(arr2[j]);
        }
        return set.size();
    }
    public static int intersectionof2Arrays(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++) {
            if(set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println(intersectionof2Arrays(arr1, arr2));

    }

}
