package Arrays;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = {21,7,32,81,5};
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
    }
}
