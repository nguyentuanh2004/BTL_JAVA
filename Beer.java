import java.util.Scanner;
public class Beer {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int res = n / m;
            int temp = res;
            while (temp >= k) {
                res += temp / k;
                temp = (temp % k) + (temp / k);
            }
            System.out.println(res);
        }
    }
}