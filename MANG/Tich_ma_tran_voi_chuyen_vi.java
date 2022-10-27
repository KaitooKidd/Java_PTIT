package MANG;
import java.util.*;
public class Tich_ma_tran_voi_chuyen_vi {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int h = 1; h <= t; h++) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] c = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        c[i][j] += a[i][k] * a[j][k];
                    }
                }
            }
            System.out.println("Testt " + h + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
