package Ung_dung_JAVA_Collection;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Cap_so_co_tong_bang_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt(), k = sc.nextInt();
            TreeMap<Integer,Integer> ma = new TreeMap<>();
            int[] M = new int[n];
            for(int i=0;i<n;i++) {
                M[i] = sc.nextInt();
                ma.put(M[i],ma.getOrDefault(M[i],0)+1);
            }
            long res=0;
            for(int i = 0; i < n; i++) {
                res += ma.getOrDefault(k-M[i],0);
                if(M[i]*2==k) res--;
            }
            System.out.println(res/2);
        }
    }
}
