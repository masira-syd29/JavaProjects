import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();
        //ArrayListsyntax same 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //search
        /*if(set.contains(1)) {
            System.out.println("Set contains 1");
        } 
        if(!set.contains(6)) {
            System.out.println("Does not contain");
        }

        //delete
        set.remove(1);
        if(!set.remove(1)) {
            System.out.println("Does not contain 1");
        } */
        System.out.println("Size of set is: " + set.size());
        //print name of set
        System.out.println(set);

        Iterator it = set.iterator();
        //has next(); next();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
