package Java_co_ban;

import java.util.Scanner;

public class Uoc_so_chia_het_cho2 {
    public static long ktra(int n)  {
        long dem = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n%i==0)
            {
                if(n/i == i)
                {
                    if(i%2==0) dem++;
                }
                else
                {
                    if(i % 2 == 0) dem++;
                    if(n/i % 2 == 0) dem++;
                }
            }
        }
        return  dem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            t--;
            int n = sc.nextInt();
            System.out.println(ktra(n));
        }
    }
}
