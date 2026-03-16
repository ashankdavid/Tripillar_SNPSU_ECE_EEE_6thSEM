package Recursion;

public class SUmOfNNaturalRec {

    static int sum(int x){
        if(x==1){  // base case
            return 1;
        }else{
            return x + sum(x-1);  // recursive case
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = sum(num);
        System.out.println(result);
    }
}
