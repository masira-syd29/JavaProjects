import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


        //insertion
        map.put("India", 120);
        map.put("China", 150);
        map.put("Us", 30);

        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);

        /*if(map.containsKey("Japan")) {
            System.out.println("Present in the map");
        } else {
            System.out.println( "key is not present in map");
        } */

        //System.out.println(map.get("China"));
        //System.out.println(map.get("Indonesia"));

       /*  int arr[] = {12, 15, 18};
        for(int i=0; i<3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();*/

        /*for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(e.getValue());
        }
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + " " + map.get(key));
        } */

        map.remove("China");
        System.out.println(map);

    }
}
