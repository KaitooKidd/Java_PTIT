package Java_co_ban;

import java.util.Scanner;

public class Kt_Fibo {
    public static boolean kt(long n){
        long a = 0, b = 1, c = 0;
        while (c < n)
        {
            c = a+b;
            a = b;
            b = c;
        }
        return c == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a > 0) {
            long n = sc.nextLong();
            if(kt(n)) System.out.println("YES");
            else System.out.println("NO");
            a--;
        }
    }
}
