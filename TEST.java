import java.util.*;
import java.math.*;
public class TEST {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), q = sc.nextInt();
        int[][] a = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= n; j++) a[i][j] = sc.nextInt();
        int[][] c = new int[n+1][n+1], p = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int j = 1; i+j-1 <= n; j++) {
                temp += a[j][i+j-1];
            }
            for (int j = 1; i+j-1 <= n; j++) c[j][i+j-1] = temp;
            temp = 0;
            if (i >= 2) {
                for (int j = 1; j+i-1 <= n; j++) {
                    temp += a[i+j-1][j];
                }
                for (int j = 1; j+i-1 <= n; j++) c[i+j-1][j] = temp;
            }
        }
        for (int i = 2; i <= n*2; i++) {
            int temp = 999999;
            for (int k = 1; k <= n && k < i; k++) {
                if (i-k > n) continue;
                temp = Math.min(temp, a[k][i-k]);
            }
            for (int k = 1; k <= n && k < i; k++) {
                if (i-k > n) continue;
                p[k][i-k] = temp;
            }
        }
        while (q-->0) {
            int u = sc.nextInt(), v = sc.nextInt();
            System.out.println(c[u][v]+" "+p[u][v]);
        }
    }
}
