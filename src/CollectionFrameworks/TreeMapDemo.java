package CollectionFrameworks;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        map.put(4, "D");

        System.out.println(map);

        //get()
        System.out.println(map.get(2)); // give me the val stored at 2

        //firstKey() --> Smallest Key
        System.out.println(map.firstKey());

        //lastKey() --> Largest Key
        System.out.println(map.lastKey());

        //remove()
        map.remove(2);
        System.out.println(map);
    }
}

/**
 * Stores the elements in key and value pair
 * key must be unique
 * Automatically Sorts the Keys
 * uses hash internally
 * uses Tree Structure
 * Slower than HashMap
 */