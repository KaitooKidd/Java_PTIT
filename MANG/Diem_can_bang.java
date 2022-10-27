package MANG;

import java.util.Scanner;

public class Diem_can_bang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            t--;
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] sum = new int[n+1];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            sum[0] = a[0];
            for(int i = 1; i < n; i++)
                sum[i] = a[i] + sum[i-1];
            boolean check = false;
            for(int i = 1; i < n; i++) {
                if(sum[i-1] == sum[n-1]-sum[i]) {
                    check = true;
                    System.out.println(i+1);
                    break;
                }
            }
            if(check == false) System.out.println("-1");
        }
    }
}
