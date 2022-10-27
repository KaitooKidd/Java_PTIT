package MANG;
import java.util.Scanner;
public class Sort_Bubble {
    public static void in(int a[], int n) {
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void Bubble(int a[], int n) {
        for(int i  = 0; i < n-1; i++) {
            int check = 0;
            for(int j = 0; j < n-1-i; j++) {
                if(a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    check = 1;
                }
            }
            if(check == 0) break;
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
        Bubble(a,n);
    }
}
