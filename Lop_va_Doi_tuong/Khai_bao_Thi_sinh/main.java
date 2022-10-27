package Lop_va_Doi_tuong.Khai_bao_Thi_sinh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        double d1,d2,d3;
        a = sc.nextLine();
        b = sc.nextLine();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        d3 = sc.nextDouble();
        Thi_sinh A = new Thi_sinh(a,b,d1,d2,d3);
        System.out.println(A);
    }
}
