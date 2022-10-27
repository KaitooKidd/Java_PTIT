package MANG;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_Selection {
        public static void in(int a[], int n) {
            for(int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
        public static void Selection(int a[], int n) {
            int min, index = 0;
            for (int i = 0; i < n - 1; i++) {
                min = a[i];
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < min) {
                        min = a[j];
                        index = j;
                    }
                }
                int tmp = a[i];
                a[i] = a[index];
                a[index] = tmp;
                System.out.print("Buoc " + (i + 1) + ": ");
                in(a, n);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Selection(a,n);
        }
}
