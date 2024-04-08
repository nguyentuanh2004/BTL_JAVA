import java.util.*;
import java.math.*;
public class Circle {
    static double Dis(double Ax, double Ay, double Bx, double By)
    {
        return Math.sqrt((Ax-Bx)*(Ax-Bx)+(Ay-By)*(Ay-By));
    }
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-->0)
        {
            double[][] X = new double[2][3];
            for (int i=0; i<3; i++)
            {
                X[0][i] = inp.nextDouble();
                X[1][i] = inp.nextDouble();
            }
            double AB, AC, BC;
            AB = Dis(X[0][0], X[1][0], X[0][1], X[1][1]);
            AC = Dis(X[0][0], X[1][0], X[0][2], X[1][2]);
            BC = Dis(X[0][2], X[1][2], X[0][1], X[1][1]);
            if (AB<AC) {double temp = AB; AB = AC; AC = temp;}
            if (AB<BC) {double temp = AB; AB = BC; BC = temp;}
            double R;
            if (AB*AB>=AC*AC+BC*BC) R = AB/2;
            else {
                double p = (AB+AC+BC)/2;
                double s = Math.sqrt(p*(p-AB)*(p-AC)*(p-BC));
                R = AB*AC*BC/(4*s);
            }
            double S = R*R*Math.PI;
            System.out.printf("%.6f\n", S);
        }
    }
}
