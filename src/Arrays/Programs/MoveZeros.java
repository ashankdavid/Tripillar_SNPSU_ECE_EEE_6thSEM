package Arrays.Programs;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int index = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        } // {1,3,12,3,12}

        while(index<arr.length){ // fill zeros at end
            arr[index] = 0;
            index++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
