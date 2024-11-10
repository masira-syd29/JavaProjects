import java.util.HashSet;

public class Recursion2 {

    //TOWER OF HANOI
    /*public static void towerofHanoi(int n, String src, String helper, String dest) {
        if(n ==1) {
            System.out.println("Transfer Disk " + n + " from " +src+ " to " +dest);
            return;
        }
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk " + n +" from " +src+ " to " +dest);
        towerofHanoi(n-1, helper, src, dest);
        
    }
    public static void main(String[] args) {
       int n = 3;
       towerofHanoi(n, "S", "H", "D"); 
    } */


    //PRINT A STRING IN REVERSE
    /*public static void printReverse(String str, int index) { 
        if(index ==0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverse(str, index-1);
        
    }
    public static void main(String[] args) {
        String str = "maseera";
        printReverse(str, str.length()-1);
    } */

    //prin the first and the last occurence of an element in string
    /**public static int first = -1;
    public static int last = -1;

    public static void findOccur(String str, int index, char element) {
        if(index ==str.length()) {
            System.out.println(first);
            System.err.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element) {
            if(first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccur(str, index+1, element);
        
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccur(str, 0, 'a');
    } */

    //check if an array is sorted {1234}
    /*public static boolean isSorted(int arr[], int index) {
        if(index == arr.length-1) {
            return true;
        }
        if(arr[index] < arr[index+1]) {
            //array is sorted till now
            return isSorted(arr, index+1);
        } else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 3};
        System.out.println(isSorted(arr, 0));
    } */


    //move all x at the end of the string
    /*private static void moveAllX(String str, int index, int count, String newString) {
        if(index == str.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'x') {
            count++;
            moveAllX(str, index+1, count, newString);
        } else{
            newString += currChar; //newString = newstring + currchar
            moveAllX(str, index+1, count, newString);

        }
        
    }
    public static void main(String[] args) {
        String str = "axbxcdxxe";
        moveAllX(str, 0, 0, "");
    } */

    //remove duplicates in a string
    /*/public static boolean[] map = new boolean[26];

    public static void removeDup(String str, int index, String newString) {

        if(index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar - 'a']) {
            removeDup(str, index+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDup(str, index+1, newString);

        }
        
    }

    public static void main(String[] args) {
        String str = "abbccdea";
        removeDup(str, 0, "");

    }*/

    //print all the subsequences of a string
    /*public static void subSequences(String str, int index, String newString)  {

        if(index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        //to be
        subSequences(str, index+1, newString+currChar);

        //or not to be
        subSequences(str, index+1, newString);


        
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, "");
    } */



    //print all the unique subsequences of a string
    /*public static void subSequences(String str, int index, String newString, HashSet<String> set)  {

        if(index == str.length()) {
            if(set.contains(newString)) {
                return;
            } else {
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }

        char currChar = str.charAt(index);

        //to be
        subSequences(str, index+1, newString+currChar, set);

        //or not to be
        subSequences(str, index+1, newString, set);


        
    }
    public static void main(String[] args) {
        String str = "abcd";
        HashSet<String> set = new HashSet<>();
        subSequences(str, 0, "", set);
    } */


    //print nokia kepad combination
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printcombinations(String str, int index, String combination) {

        if(index == str.length()) {
            System.out.println(combination);
            return;
        }
        char curChar = str.charAt(index);
        String mapping = keypad[curChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            printcombinations(str, index+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "4";
        printcombinations(str, 0, "");
    }
}
