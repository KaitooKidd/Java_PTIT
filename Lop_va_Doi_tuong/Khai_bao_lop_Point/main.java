package Lop_va_Doi_tuong.Khai_bao_lop_Point;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            double x1,x2,y1,y2;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            Point P1 = new Point(x1,y1);
            Point P2 = new Point(x2,y2);
            //new Point().distance(P1,P2);
            System.out.printf("%.4f\n",new Point().distance(P1,P2));
        }
    }
}
