import java.util.Scanner;
import java.math.*;
public class Gunny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); n--;
        double x0, h;
        double[] y = new double[n+1];
        double[] x = new double[n+1];
        for (int i = 0; i <= n; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
        x0 = x[0]; h = x[1] - x[0];
        double X = sc.nextDouble();
        double t = sc.nextDouble();
        double Y = solve(n, y, x0, h, X);
        //System.out.printf("%.3f\n",Y);
        double dis = Math.sqrt((X - x[0]) * (X - x[0]) + (Y - y[0]) * (Y - y[0]));
        if (Math.abs(dis - t) <= 1) {
            System.out.printf("YES\n%.3f\n",Y);
        } else {
            System.out.printf("YES\n%.3f\n",Y);
            System.out.printf("NO\n%.3f\n",dis);
        }
    }
    public static double solve(int n, double[] y, double x0, double h, double x) {
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
        return N;
    }
}
