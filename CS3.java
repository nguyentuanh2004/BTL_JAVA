import java.util.*;
public class CS3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            String res = "";
            while (n!=0){
                char c = (char)('0' + (n%3));
                res = c+""+res;
                n/=3;
            }
            System.out.println(res);
        }
    }
}
