/**
 * description:  <br>
 * date: 2020/12/4 17:53 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
public class AnswerDp1 {
    public static void main(String[] args) {
        int n = 40;
        long result = dpMethod(n);
        System.out.println(result);
    }

    private static long dpMethod( int n ){
        // 先创建一个数组来保存历史数据
        long[] dp = new long[n+1];
        // 给出初始值
        dp[2] = 2;
        dp[1] = 1;
        // 通过关系式来计算出 dp[n]
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        // 把最终结果返回
        return dp[n];
    }
}
