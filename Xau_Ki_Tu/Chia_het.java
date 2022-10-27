package Xau_Ki_Tu;

import java.math.BigInteger;
import java.util.Scanner;

public class Chia_het {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = BigInteger.valueOf(0);
            if(a.mod(b).equals(c) || b.mod(a).equals(c))  {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
