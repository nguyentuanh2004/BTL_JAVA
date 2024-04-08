import java.util.*;
import java.math.*;
public class CanBang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong(), b = sc.nextLong();
            long c = Math.abs(a-b);
            long res = 0;
            while (res*(res+1)/2<c) ++res;
            while ((res*(res+1)/2-c)%2!=0) ++res;
            System.out.println(res);
        }
    }
}
