package Recursion;

public class FibonacciRec {
    static int fib(int x){
        if(x==0||x==1){ // base case
            return x;
        }else{
            return fib(x-1) + fib(x-2);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        for(int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
