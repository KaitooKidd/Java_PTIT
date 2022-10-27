package Lop_va_Doi_tuong.Khai_bao_SV;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id,name,lop,Date;
        float x;
        id = "B20DCCN001";
        name = sc.nextLine();
        lop = sc.nextLine();
        Date = sc.nextLine();
        x = sc.nextFloat();

        Sinh_Vien S = new Sinh_Vien(id,name,lop,Date,x);
        System.out.print(S);
        System.out.printf("%.2f",S.getGpa());
    }
}
