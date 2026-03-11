package CollectionFrameworks;


import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        //put()
        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Orange");

        System.out.println(map);

        //get()
        System.out.println(map.get(2)); // give me the val stored at 2

        //containsKey()
        System.out.println("Contains key 3?" + map.containsKey(3));

        // remove()
        map.remove(1);

        System.out.println(map);
    }
}
/**
 * Stores the elements in key and value pair
 * key must be unique
 * Maintains the order of insertion
 * uses hash internally
 * uses Node Structure
 */
