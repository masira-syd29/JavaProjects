import java.util.Scanner;

public class StringsExercise {
    //compare two strings
    /*public static void main(String[] args) {
        String name1 = "Maseera";
        String name2 = "Maseera";

        //DO NOT USE == to check for string equality it giives incorrect answer
        //it guves correct answer here
        if(name1 == name2) {
            System.out.println("The strings are same");
        } else {
            System.out.println("They are different");
        }

        //use this method or CompareTo method always for accurate results

        if(name1.equals(name2)) {
            System.out.println("The strings are same");
        } else {
            System.out.println("They are different");
        }
    } */

    //ParseInt Method of Integer class
    /*public static void main(String[] args) {
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
    } */

    //ToString Method of String class
    /*public static void main(String[] args) {
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());
    } */


    //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    /**public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];

        int totLength = 0;

        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.println(totLength);
    } */

    //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
    //Example : original = “eabcdef’ ; result = “iabcdif”
    //Original = “xyz” ; result = “xyz”
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String results = "";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                results += 'i';
            } else {
                results += str.charAt(i);
            }
        }
        System.out.println(results);

    } */



    //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
    //Example :email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
    //email = “helloWorld123@gmail.com”; username = “helloWorld123”

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String userName = "";


        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
