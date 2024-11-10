import java.util.*;
public class IBMExample4 {
    public static String properCompression(String s) {
        StringBuilderss compressedStr = new StringBuilderss();

        for(int i = 0; i < s.length(); i += 2) { char c = s.charAt(i); int count = Character.getNumericValue(s.charAt(i + 1)); while (count > 0) {
            compressedStr.append(c);
            count--;  
            }
        }
        return compressedStr.toString();
        
    }
    public static void main(String[] args) {
        String inpuStr = "a3b5c2a2c5";
        String compressedResult = properCompression(inpuStr);
        System.out.println(compressedResult); //output: "aaabbbbbccccccc"
    }
}
