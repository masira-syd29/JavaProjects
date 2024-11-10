
import java.util.Arrays;

/*public class IBMPractice4 {
    public static void main(String[] args) {
        // Example usage
        int[] pref = {3, 5, 6, 7};

        // Reconstruct the original array
        int[] arr = reconstructArray(pref);

        // Print the reconstructed array
        System.out.println("Original Array (arr): " + Arrays.toString(arr));
    }

    // Function to reconstruct the original array from prefix XOR array
    private static int[] reconstructArray(int[] pref) {
        int n = pref.length;

        // Initialize the array with the same size as pref
        int[] arr = new int[n];

        // Calculate the first element of arr separately
        arr[0] = pref[0];

        // Reconstruct the rest of the array using the XOR property
        for (int i = 1; i < n; i++) {
            arr[i] = pref[i] ^ arr[i - 1];
        }

        return arr;
    }
} **/

public class IBMPractice4 {
    public static int[] findOriginalArray(int[] pref) {
        int n = pref.length;
        int[] arr = new int[n];
        
        arr[0] = pref[0];
        for (int i = 1; i < n; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] pref = {3, 5, 2, 10};
        int[] originalArray = findOriginalArray(pref);
        
        System.out.print("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        // Output: Original Array: 3 8 10 2
    }
}

