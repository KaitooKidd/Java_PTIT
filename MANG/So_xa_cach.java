package MANG;

import java.util.Arrays;
import java.util.Scanner;

public class So_xa_cach {
    private static int n;
    private static int[] a = new int[12];
    private static int[] b = new int[12];
    public static void in() {
        for(int i = 1; i <= n; i++)
            System.out.print(a[i]);
       // System.out.println();
    }
    public  static  boolean test()
    {
        for(int i = 1; i < n; i++)
        {
            if(Math.abs(a[i]-a[i+1])==1)
                return false;
        }
        return true;
    }
    public static void Try(int i) {
        for(int j = 1; j <= n; j++) {
            if(b[j] == 0) {
                a[i] = j;
                b[j] = 1;
                if(i == n) {
                    if (test()) {
                        for(int k = 1; k <= n; k++)
                            System.out.print(a[k]);
                        System.out.println();
                    }
                }
                else Try(i+1);
                b[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            t--;
            n = sc.nextInt();
            Arrays.fill(b,0);
            Try(1);
            System.out.println();
        }
    }
}
