package Arrays.Programs;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2,2,1,2,3,2,2};
        int n = arr.length;

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }if(count>n/2){
                System.out.println("Majority Element: " + arr[i]);
            }else{
                System.out.println("No Majority Elements Found");
            }
        }
    }
}
