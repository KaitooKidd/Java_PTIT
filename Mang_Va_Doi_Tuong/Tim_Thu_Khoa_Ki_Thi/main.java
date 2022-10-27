package Mang_Va_Doi_Tuong.Tim_Thu_Khoa_Ki_Thi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Sinh_vien> S = new ArrayList<>();
        while (t-->0) {
            sc.nextLine();
            S.add(new Sinh_vien(sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat()));
        }
        float x =  Collections.max(S).getSum();
        for (Sinh_vien i : S) {
            if(i.getSum() == x)
                System.out.println(i);
        }
    }
}
