package DynammicProgmramming.Problems;

public class CoinChange {

    static int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        // Base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1; // one way to make 0
        }

        // Build dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {

                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int amount = 4;

        System.out.println("Number of ways: " + coinChange(coins, amount));
    }
}