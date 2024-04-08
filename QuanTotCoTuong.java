import java.util.Scanner;
public class QuanTotCoTuong {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt(), y = sc.nextInt();
        if (x <= 3 || (x == 4 && y%2==1)) {
            System.out.println(-1);
        } else {
            String s = "ABCDE";
            System.out.println(x-3+y%2);
            System.out.println(s.charAt(y/2));
        }
    }
}
