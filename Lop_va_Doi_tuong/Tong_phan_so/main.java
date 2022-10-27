package Lop_va_Doi_tuong.Tong_phan_so;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a,b,c,d;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();
        Phso p1 = new Phso(a,b);
        Phso p2 = new Phso(c,d);
        System.out.println(p1.sum(p2));
    }
}
