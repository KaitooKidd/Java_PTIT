package MANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Day_con_co_k_ptu_tang_dan {
    static int n,k;
    static ArrayList<Integer> l = new ArrayList<>();
    static int[] a = new int[15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                l.add(m);
            }
            for (int i = 0; i <= k; i++) {
                a[i] = i;
            }
            Collections.sort(l);
            Try(1);
            l.clear();
        }
    }
    public static void Try(int i) {
        for(int j = a[i-1]+1; j <= n-k+i; j++) {
            a[i] = j;
            if(i==k) {
                for(int h = 1; h <= k; h++)
                    System.out.print(l.get(a[h]-1)+" ");
                System.out.println();
            }
            else Try(i+1);
        }
    }
}
