package MANG;

import java.util.ArrayList;
import java.util.Scanner;

public class Uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Long>l2 = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                l1.add(x);
            }
            l2.add(lcm(1,l1.get(0)));
            for(int i = 0; i < n-1; i++) {
                l2.add(lcm(l1.get(i),l1.get(i+1)));
            }
            l2.add(lcm(1,l1.get(n-1)));
            for(long x : l2) System.out.print(x+" ");
            System.out.println();
        }
    }
    public static long gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);

    }
    public static long lcm(int a, int b) {
        return ((long) a *b)/gcd(a,b);
    }
}
