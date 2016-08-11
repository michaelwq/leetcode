public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m == 0 || n == 0){
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (obstacleGrid[i][j]){
                    if (i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else {
                        int tmp = 0;
                        if (obstacleGrid[i-1][j] != 1){
                            tmp += dp[i-1][j];
                        }
                        if (obstacleGrid[i][j-1] != 1){
                            tmp += dp[i][j-1];
                        }
                        dp[i][j] = tmp;
                    }
                }
            }
        }
        return dp[m][n];
    }
}