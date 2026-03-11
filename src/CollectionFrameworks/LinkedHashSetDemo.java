package CollectionFrameworks;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set);

        // Contains()
        System.out.println("Contains 20?" + set.contains(20));

        // remove()
        set.remove(10);
        System.out.println(set);

        //size()
        System.out.println(set.size());
    }
}

/**
 * Doesnot allow duplicates
 * Maintains the order of insertion
 * uses hashing internally
 * Slightly SLow for add, remove, and search operations
 */
