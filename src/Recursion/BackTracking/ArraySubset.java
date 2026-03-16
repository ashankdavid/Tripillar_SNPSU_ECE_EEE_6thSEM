package Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;
public class ArraySubset {
    static void ArraySubSets(int[] arr, int index, List<Integer> current){
        // Base Case
        if(index == arr.length){
            System.out.println(current);
            return;
        }
        // Adding the element
        current.add(arr[index]);
        ArraySubSets(arr, index+1, current);
        // BackTracking
        current.remove(current.size()-1);
        // Skip and Explore
        ArraySubSets(arr, index+1, current);
    }
    public static void main(String[] args) {
        int[]  arr = {1,2,3};
        int index = 0;
        ArraySubSets(arr, index, new ArrayList<>());
    }
}
