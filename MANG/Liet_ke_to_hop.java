package MANG;

import java.util.Scanner;

public class Liet_ke_to_hop {
    private static int n,k,dem = 0;
    private static int[] a = new int[12];
    public static void in() {
        dem++;
        for(int i = 1; i <= k; i++)
            System.out.print(a[i]);
        System.out.print(" ");
    }
    public static void Try(int i) {
        for(int j = a[i-1]+1; j <= n-k+i; j++) {
            a[i] = j;
            if(i == k) in();
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt(); k = sc.nextInt();
        Try(1);
        System.out.print("\n"+ "Tong cong co " + dem + " to hop");
    }
}
