/**
 * description:  一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 问总共有多少条不同的路径？<br>
 * date: 2021/1/14 15:51 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
public class dp2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        int res = dynamicPlaning(m, n);
        System.out.println(res);
    }

    private static int dynamicPlaning(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++){
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
                System.out.println(i + "," + j + "的路径为:" + dp[i][j]);
            }
        }
        return dp[m-1][n-1];
    }
}
