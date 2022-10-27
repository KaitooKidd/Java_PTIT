package Lop_va_Doi_tuong.Khai_bao_NV;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nhan_Vien sn = new Nhan_Vien();
        sn.setTen(sc.nextLine());
        sn.setGioitinh(sc.nextLine());
        sn.setNgsinh(sc.nextLine());
        sn.setDiachi(sc.nextLine());
        sn.setMathue(sc.nextLine());
        sn.setNgky(sc.nextLine());
        sn.show();
    }
}
