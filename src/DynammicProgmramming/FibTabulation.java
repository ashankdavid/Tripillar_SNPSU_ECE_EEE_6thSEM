package DynammicProgmramming;

public class FibTabulation {
    static int fib(int x){
        // base case
        if(x==0 || x==1){
            return x;
        }

        // create a dp array
        int[] dp = new int[x+1];

        // base values
        dp[0] = 0;
        dp[1] = 1;


        // build the solution from bottom up
        for(int i=2; i<=x; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[x];
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fib(n);
        System.out.println(result);
    }
}
