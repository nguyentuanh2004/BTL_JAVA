import java.math.*;
import java.util.Scanner;
public class TuAnhh {
    static BigInteger[] Cal = new BigInteger[1005];
    static BigInteger[] dp = new BigInteger[1005];
    static BigInteger[] sum = new BigInteger[1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next(), y = sc.next();
        sc.close();
        x = " " + x; y = " " + y;
        dp[1] = BigInteger.valueOf(9);
        for (int i = 2; i < 1005; i++) {
            dp[i] = dp[i - 1].multiply(BigInteger.valueOf(9));
        }
        dp[1] = BigInteger.valueOf(10);
        sum[1] = dp[1];
        for (int i = 2; i < 1005; i++) {
            sum[i] = sum[i - 1].add(dp[i]);
        }
        Cal[1] = BigInteger.valueOf(9);
        for (int i = 2; i < 1005; i++) Cal[i] = Cal[i - 1].multiply(BigInteger.valueOf(9));
        BigInteger countX, countY;
        if (x.length() == 2) countX = BigInteger.valueOf((x.charAt(1) - '0') + 1); else countX = Backtrack(1, x);
        if (y.length() == 2) countY = BigInteger.valueOf((y.charAt(1) - '0') + 1); else countY = Backtrack(1, y);
        //System.out.println(countY);
        if (check(x) == true) {
            countY = countY.subtract(countX);
            countY = countY.add(BigInteger.valueOf(1));
            System.out.println(countY);
        } else {
            System.out.println(countY.subtract(countX));
        }
    }
    public static boolean check(String s) {
        for (int i = 1; i < s.length(); i++) if (s.charAt(i) == s.charAt(i - 1)) return false;
        return true;
    }
    public static BigInteger Backtrack(int i, String x) {
        if (i == x.length() - 1) {
            if (x.charAt(i) >= x.charAt(i - 1)) return BigInteger.valueOf(x.charAt(i) - '0');
            else return BigInteger.valueOf((x.charAt(i) - '0') + 1);
        }
        if (i == 1) {
            int len = x.length() - 1 - i;
            BigInteger res = sum[len];
            BigInteger cnt = Cal[len];
            return res.add(Backtrack(i + 1, x).add(cnt.multiply(BigInteger.valueOf(Math.max(0, (x.charAt(i) - '0') - 1)))));
        }
        int len = x.length() - 1 - i;
        BigInteger cnt = Cal[len];
        if (x.charAt(i) == x.charAt(i - 1)) return cnt.multiply(BigInteger.valueOf(x.charAt(i) - '0'));
        else if (x.charAt(i) < x.charAt(i - 1)) return Backtrack(i + 1, x).add(cnt.multiply(BigInteger.valueOf(x.charAt(i) - '0')));
        else {
            int temp = Math.max(0, (x.charAt(i) - '0') - 1);
            return Backtrack(i + 1, x).add(cnt.multiply(BigInteger.valueOf(temp)));
        }
    }
}