package DynammicProgmramming;

public class FibMemoization {
    static int fib(int x, int[] dp){
        // base case
        if (x == 0 || x == 1) {
            return x;
        }
        // step 3
        if(dp[x] != -1){
            return dp[x];
        }
        // step 2
        dp[x] =  fib(x-1, dp) + fib(x-2, dp);
        return dp[x];
    }
    public static void main(String[] args) {
        int n = 100;
        // step 1
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        int result = fib(n, dp);
        System.out.println(result);
    }
}
