package Xau_Ki_Tu;

import java.util.Scanner;
import java.math.*;
public class Hieu_2so_nguyen_lon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b);
            int y = c.toString().length();
          //  System.out.println(c);
            if (a.compareTo(b) == -1) {
                int x = b.toString().length();
                for (int i = 0; i < x-y+1; i++)
                    System.out.print("0");
                System.out.println(c.abs());
            } else {
                int x = a.toString().length();
                for (int i = 0; i < x-y; i++)
                    System.out.print("0");
                System.out.println(c);
            }
            t--;
        }
    }
}
