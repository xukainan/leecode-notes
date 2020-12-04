/**
 * description:  一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。<br>
 * date: 2020/12/4 17:36 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
public class dp1 {
    public static void main(String[] args) {
        int n = 40;
        int result = dpMethod(n);
        System.out.println(result);
    }

    private static int dpMethod(int n) {
        if(n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return dpMethod(n-1) + dpMethod(n-2);

    }
}
