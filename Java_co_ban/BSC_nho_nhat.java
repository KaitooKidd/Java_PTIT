package Java_co_ban;

import java.util.Scanner;
import java.math.BigInteger;
public class BSC_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println((a.multiply(b).divide(a.gcd(b))));
            t--;
        }
    }
}
