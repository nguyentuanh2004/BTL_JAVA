import java.util.Scanner;
public class TuAnh {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] A = new long[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
        }
        long S1, S2, S3;
        S1 = S2 = S3 = 0;
        int j = n;
        for (int i = 0; i < n; i++) {
            --j;
            S1 += A[i] * A[i];
            S2 += A[i] * A[j];
            if (i < n - 1) {
                S3 += A[i] * A[i+1];
            }
        }
        System.out.print(S1 + "\n" + S2 + "\n" + S3);
    }
}
