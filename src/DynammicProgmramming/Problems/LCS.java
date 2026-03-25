package DynammicProgmramming.Problems;

public class LCS {
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        int result = lcs(s1, s2);
        System.out.println("LCS Length: " + result);
    }

    public static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Step 1: Create DP table
        int[][] dp = new int[n + 1][m + 1];

        // Step 2: Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                // Case 1: Characters match
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                // Case 2: Characters don't match
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Step 3: Return answer
        return dp[n][m];
    }
}
