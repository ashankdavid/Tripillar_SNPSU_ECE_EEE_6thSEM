package CollectionFrameworks;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

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
 * Doesnot maintains the order of insertion
 * uses hashing internally
 * very fast for add, remove, and search operations
 */
