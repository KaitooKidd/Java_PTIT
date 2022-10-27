package Lop_va_Doi_tuong.Khai_bao_lop_HCN;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        String s = sc.next();
        if(a > 0 && b > 0) {
            Rectange R = new Rectange(a, b, s);
            System.out.print(R);
        }
        else System.out.print("INVALID");
    }
}
