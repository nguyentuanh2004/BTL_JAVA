import java.util.Scanner;
public class XepLaBai {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long res = 3 * (n - 1) * n / 2;
        res += 2 * n;
        System.out.print(res);
    }
}
