import java.util.*;
import java.math.*;
public class SucManh {
    static int res = 0;
    public static void TRY(int[][] a, int j, int sum, int n, int m){
        if (j==n){
            res = Math.max(res, sum%m);
            return;
        }
        for (int i = 1; i <= a[j][0]; i++){
            TRY(a, j+1, sum+a[j][i]*a[j][i], n, m);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int a[][] = new int[10][10];
        for (int i = 0; i < N; i++){
            int k = sc.nextInt();
            a[i][0] = k;
            for (int j = 1; j <= k; j++){
                a[i][j] = sc.nextInt();
            }
        }
        TRY(a, 0, 0, N, M);
        System.out.println(res);
        sc.close();
    }
}
