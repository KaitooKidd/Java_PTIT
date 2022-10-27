package Xau_Ki_Tu;

import java.math.BigInteger;
import java.util.Scanner;

public class Tim_so_du {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            BigInteger a = sc.nextBigInteger();
            if(a.mod(BigInteger.valueOf(4)).equals(BigInteger.valueOf(0)))
                System.out.println(4);
            else System.out.println(0);
        }

    }
}
