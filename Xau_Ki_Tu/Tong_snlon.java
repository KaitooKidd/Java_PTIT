package Xau_Ki_Tu;

import java.math.BigInteger;
import java.util.Scanner;

public class Tong_snlon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.add(b));
            t--;
        }
    }
}
