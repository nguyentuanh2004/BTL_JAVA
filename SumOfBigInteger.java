import java.util.Scanner;
import java.math.BigInteger;
public class SumOfBigInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BigInteger a, b;
        a = input.nextBigInteger();
        b = input.nextBigInteger();
        //hoac co the gan sum = a.add(b);
        System.out.println(a.add(b));
        input.close();
    }
}
