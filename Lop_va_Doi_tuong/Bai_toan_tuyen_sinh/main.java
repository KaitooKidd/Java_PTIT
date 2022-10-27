package Lop_va_Doi_tuong.Bai_toan_tuyen_sinh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SV S = new SV(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        S.tooString();
    }
}
