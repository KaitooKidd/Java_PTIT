package Lop_va_Doi_tuong.Thu_nhap_giao_vien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Giao_vien G = new Giao_vien(sc.nextLine(),sc.nextLine(),sc.nextLong());
        System.out.println(G);
    }
}
