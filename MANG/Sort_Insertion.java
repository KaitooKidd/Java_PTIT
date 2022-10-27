package MANG;
import java.util.Scanner;
public class Sort_Insertion {
        public static void in(int a[], int n) {
            for(int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
        public static void Insertion(int a[], int n) {
            for(int i = 0; i < n; i++) {
                int j = i-1, res = a[i];
                while (j >= 0 && a[j] >= res) {
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = res;
                System.out.print("Buoc "+(i)+": ");
                in(a,i+1);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Insertion(a,n);
        }
}
