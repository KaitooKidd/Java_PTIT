package Java_co_ban;

import java.util.Arrays;
import java.util.Scanner;

public class Tong_uoc_so_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        int N = 2*1000000;
        int[] F = new int[N+1];
        Arrays.fill(F,0);
        F[0] = 1; F[1] = 1;
        for(int i = 2; i*i <= N; i++ ) {
            if (F[i] == 0) {
                for(int j = i*i; j <= N; j+=i)
                    F[j] = 1;
            }
        }
        while (t>0){
            t--;
            int n = sc.nextInt();
            for(int i = 2; i <= n; i++) {
                if(F[n] == 0) {
                    sum += n;
                    break;
                }
                while (n % i == 0) {
                    sum += i;
                    n /= i;
                }
            }
        }
        System.out.println(sum);
    }
}
