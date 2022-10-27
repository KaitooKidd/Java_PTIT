package MANG;

import java.util.Scanner;

public class BSC_Min_n_so_nguyen {
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            t--;
            int n = sc.nextInt();
            long res = 1;
            for(int i = 1; i <= n; i++)
                res = BSCNN(i,res);
            System.out.println(res);
        }
    }
}
