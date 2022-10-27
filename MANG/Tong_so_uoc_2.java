package MANG;

import java.util.Arrays;
import java.util.Scanner;

public class Tong_so_uoc_2 {
    static int N = 1000000;
    static int[] F = new int[N+1];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt(); b = sc.nextInt();
        Arrays.fill(F,0);
        F[0] = 1; F[1] = 1;
        for(int i = 2; i*i <= b; i++ ) {
            if (F[i] == 0) {
                for(int j = i*i; j <= b; j+=i)
                    F[j] = 1;
            }
        }
        long cout = 0;
        for(int i = a; i <= b; i++) {
            if(tong_uoc(i)) {
                cout++;
            }
        }
        System.out.println(cout);
    }
    public static boolean tong_uoc(int n) {
        long tich = 1;
        int m = n;
        for(int i = 2; i <= n; i++) {
            long sum=1;
            if(F[n] == 0) {
                sum = sum*n+1;
                n = -1;
            }
            while (n%i==0) {
                n/=i;
                sum = sum*i+1;
            }
            tich*=sum;
        }

        return tich>(2L *m);
    }
}
