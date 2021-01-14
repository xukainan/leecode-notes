/**
 * description:  <br>
 * date: 2020/12/4 17:53 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
public class dp1_2 {
    public static void main(String[] args) {
        int n = 10;
        int res = dynamicPlaning(n);
        System.out.println(res);
    }

    private static int dynamicPlaning(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            int dpi = dp[i-1] + dp[i-2];
            dp[i] = dpi;
            System.out.println("第" + (i+1) + "个台阶有" + dp[i] + "种跳法");
        }
        return dp[n-1];
    }
}
