package Java_co_ban;

import java.util.Scanner;

import java.lang.Math;

public class TrungJav {
    public static int kt(int n) {
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n%i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0)
        {

            int a = sc.nextInt();
            if(kt(a) == 1) System.out.println("YES");
            else System.out.println("NO");
            n--;
        }
    }
}
