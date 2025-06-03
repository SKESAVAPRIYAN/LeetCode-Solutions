class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        if (n == 1 && m == 1) return mat[0][0];

        int[][] dp = new int[n][m];

        // Initialize the first row
        for (int j = 0; j < m; j++) {
            dp[0][j] = mat[0][j];
        }

        // Fill DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int minAbove = dp[i - 1][j];
                if (j > 0) minAbove = Math.min(minAbove, dp[i - 1][j - 1]);
                if (j < m - 1) minAbove = Math.min(minAbove, dp[i - 1][j + 1]);

                dp[i][j] = mat[i][j] + minAbove;
            }
        }

        // Find the minimum value in the last row
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            ans = Math.min(ans, dp[n - 1][j]);
        }

        return ans;
    }
}
