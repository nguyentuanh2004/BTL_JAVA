import java.util.*;
public class NurseScheduleListing {
    public static void TRY(String s, int on, int n, int k1, int k2){
        if (s.length()==n){
            if (s.charAt(s.length()-1)=='1'&&((on<k1) || (on>k2))) return;
            System.out.println(s);
            return;
        }
        if (s.length()==0){
            TRY(s+"0", on, n, k1, k2);
            TRY(s+"1", on+1, n, k1, k2);
        }
        if (s.length()>0) {
            if (s.charAt(s.length()-1)=='1'){
                if (on>=k1 && on<=k2){
                    TRY(s+"0", 0, n, k1, k2);
                }
                if (on>=k1 && on<k2){
                    TRY(s+"1", on+1, n, k1, k2);
                }
                if (on<k1){
                    TRY(s+"1", on+1, n, k1, k2);
                }
            } else {
                TRY(s+"1", on+1, n, k1, k2);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k1 = sc.nextInt(), k2 = sc.nextInt();
        TRY("", 0, n, k1, k2);
    } 
}
