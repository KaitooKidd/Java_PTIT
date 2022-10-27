package Xau_Ki_Tu;

import java.math.BigInteger;
import java.util.Scanner;

public class Chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            BigInteger bg = scan.nextBigInteger();
            if(bg.mod(BigInteger.valueOf(11)).equals(BigInteger.valueOf(0)))
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
