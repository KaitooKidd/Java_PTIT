package Java_co_ban;

import java.math.BigInteger;
import java.util.Scanner;

public class Tich_luy_thua {
    private static final long mod = 1000000007;
    public static long Pow(long a, long b) {
        long tmp = 1;
        while (b > 0) {
            if(b%2 == 1)
            {
                tmp *= a;
                tmp %= mod;
            }
            b /= 2;
            a *= a;
            a %= mod;
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            a %= mod;
            System.out.println(Tich_luy_thua.Pow(a,b));
        }
    }
}
