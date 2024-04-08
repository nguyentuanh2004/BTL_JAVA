import java.util.*;
public class NoiSuyTrenLuoiDeu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x0 = sc.nextDouble(), h = sc.nextDouble();
        double[] y = new double[n+1];
        for (int i = 0; i <= n; i++) y[i] = sc.nextDouble();
        int m = sc.nextInt();
        while (m-->0) {
            double x = sc.nextDouble();
            solve(n, y, x0, h, x);
        }
    }
    public static void solve(int n, double[] y, double x0, double h, double x) {
        double t = (x-x0)/h;
        double[] D = new double[n];
        for (int i = 0; i <= n-1; i++) D[i] = y[i+1]-y[i];
        double N = y[0]+t*D[0];
        double tt = t;
        for (int j = 2; j <= n; j++) {
            for (int i = 0; i <= n-j; i++) {
                D[i] = D[i+1]-D[i];
            }
            tt *= (t-j+1)/j;
            N += D[0]*tt;
        }
        System.out.printf("%.3f\n",N);
    }
}
