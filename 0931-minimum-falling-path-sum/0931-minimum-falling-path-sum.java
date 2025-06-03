class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        if(n==1 && m==1) return mat[0][0];
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
          dp[0][i]=mat[0][i];
            }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                dp[i][j]=mat[i][j]+Math.min(dp[i-1][j],dp[i-1][j+1]);
            }
                else if(j==(m-1)){
                dp[i][j]=mat[i][j]+Math.min(dp[i-1][j],dp[i-1][j-1]);   
                }
                else{
                dp[i][j]=mat[i][j]+Math.min(dp[i-1][j-1],(Math.min(dp[i-1][j],dp[i-1][j+1])));
                }
            }
        }
        int ans=0;
        for(int i=n-1;i<n;i++){
            for(int j=1;j<m;j++){
                ans=Math.min(dp[i][j],dp[i][j-1]);
            }
        }
        return ans;
    }
}