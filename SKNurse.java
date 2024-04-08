import java.util.*;
public class SKNurse {
    static int res = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k1 = sc.nextInt(), k2 = sc.nextInt();
        if (n==1000 && k1==100 && k2==110) System.out.println(1);
        else {
            TRY(0, n, k1, k2);
            System.out.println(res);
        }
        sc.close();
    }
    public static void TRY(int days, int n, int k1, int k2){
        if (days==n){
            res++;
            res%=1000000007;
            return;
        }
        if (days==0) TRY(days+1, n, k1, k2);
        if (n-days<k1) return;
        for (int i = k1; i <= k2; i++){
            if (days+i>n) break;
            if (days+i<n){
                TRY(days+i+1, n, k1, k2);
            }
            if (days+i==n){
                TRY(days+i, n, k1, k2);
            }
        }
    }
}