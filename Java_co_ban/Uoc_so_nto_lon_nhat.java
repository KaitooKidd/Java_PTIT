package Java_co_ban;

import java.util.Scanner;

public class Uoc_so_nto_lon_nhat {
    public static boolean Isprime(long n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i==0) return false;
        return true;
    }
    public static long solve(long n){
        long max = 0;
        for(int i = 1; i <= Math.sqrt(n);i++)
        {
            if(n%i == 0)
            {
                if(Isprime(i))
                    max = i;
                if(Isprime(n/i) && (n/i) > i)
                    max = n/i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t>0){
            long n = sc.nextLong();
            System.out.println(Uoc_so_nto_lon_nhat.solve(n));
            t--;
        }
    }
}
