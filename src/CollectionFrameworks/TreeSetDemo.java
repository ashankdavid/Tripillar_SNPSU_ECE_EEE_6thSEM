package CollectionFrameworks;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        //add()
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);

        //first()
        System.out.println(set.first());

        //last()
        System.out.println(set.last());

        //remove()
        set.remove(30);
        System.out.println(set);
    }
}

/**
 * No duplicates are allowed
 * Automatically sorts the elements
 * uses tree structure internally
 * slower than hashset
 * usefull when sorted data is needed
 */
