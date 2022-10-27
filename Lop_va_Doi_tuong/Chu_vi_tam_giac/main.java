package Lop_va_Doi_tuong.Chu_vi_tam_giac;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            double x1,y1,x2,y2,x3,y3;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            Point p3 = new Point(x3,y3);
            double d1 = new Point().distance(p1,p2);
            double d2 = new Point().distance(p1,p3);
            double d3 = new Point().distance(p2,p3);
            if(d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) {
                System.out.println("INVALID");
            }
            else System.out.println(Math.round((d1+d2+d3)*1000.0)/1000.0);
        }
    }
}
