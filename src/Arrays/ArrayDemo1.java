package Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5}; //-> 1,2,3,4,5
        int[] arr2 = new int[5]; // -> 0,0,0,0,0

        System.out.println(arr1[1]); // 2

//        System.out.println(arr1); // Wrong way

        // printing arr1
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " "); // 1,2,3,4,5
        }

        System.out.println();

        // printing arr2
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " "); // 1,2,3,4,5
        }
    }
}
