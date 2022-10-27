package Xau_Ki_Tu;

import java.util.Scanner;
import java.math.BigInteger;
public class USC_songuyenlon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.gcd(b));
            t--;
        }
    }
}
