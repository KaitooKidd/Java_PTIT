package Lop_va_Doi_tuong.TInh_toan_Pso;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            Phan_so a = new Phan_so(sc.nextLong(),sc.nextLong());
            Phan_so b = new Phan_so(sc.nextLong(),sc.nextLong());
            Phan_so c = a.sum(b).nhan(a.sum(b));
            System.out.println(c+" "+a.nhan(b).nhan(c));

        }
    }
}
