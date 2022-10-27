package Lop_va_Doi_tuong.Phan_So;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        Phso P = new Phso(a,b);
        System.out.println(P.rutgon());
    }
}
