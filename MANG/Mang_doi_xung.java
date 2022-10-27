package MANG;

import java.util.Scanner;

public class Mang_doi_xung {
    public static String check(int a[]) {
        for(int i = 0; i < a.length/2; i++)
            if(a[i] != a[a.length-1-i]) return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();
            System.out.println(check(A));

            }
        }
    }
