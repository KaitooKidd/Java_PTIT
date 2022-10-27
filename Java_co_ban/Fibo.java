package Java_co_ban;

import java.util.Scanner;
public class Fibo{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        long [] F = new long[93];
        F[1] = 1;
        F[2] = 1;
        for(int i = 3; i <= 92; i++)
        {
            F[i] = F[i-1] + F[i-2];
        }
        int n = sc.nextInt();
        while(n>0)
        {
            int a = sc.nextInt();
            System.out.println(F[a]);
            n--;
        }
    }
}