package DynammicProgmramming.Problems;

public class LIS {

    static int lis(int[] arr) {
        int n = arr.length;

        int[] dp = new int[n];

        // Every element is at least 1 length
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Build dp array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find maximum
        int max = 0;
        for (int val : dp) {
            max = Math.max(max, val);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};

        System.out.println("LIS length: " + lis(arr));
    }
}
