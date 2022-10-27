package Lop_va_Doi_tuong.Bai_toan_tinh_cong;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,p;
        long luong,ngay;
        name = sc.nextLine();
        luong = sc.nextLong();
        ngay = sc.nextLong();
        p = sc.next();
        Nhan_Vienn P = new Nhan_Vienn(name,luong,ngay,p);
        System.out.println(P);

    }
}
