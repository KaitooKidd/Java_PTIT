package MANG;

import java.util.Scanner;

public class Sort_doi_cho_truc_tiep {
    public static void in(int a[], int n) {
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void doi_cho(int a[], int n) {
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            in(a,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        doi_cho(a,n);

    }
}
