package Mang_Va_Doi_Tuong.Danh_sach_doi_tuong_SV;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine());
        int n = sc.nextInt();
        ArrayList<Sinh_Vien> L = new ArrayList<>();
        while (n-->0) {
            sc.nextLine();
            L.add(new Sinh_Vien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextFloat()));
        }
        Collections.sort(L, new Comparator<Sinh_Vien>() {
            @Override
            public int compare(Sinh_Vien o1, Sinh_Vien o2) {
                if(o1.getGpa() < o2.getGpa()) return 1;
                return -1;
            }
        });
        for(Sinh_Vien s : L)
            System.out.println(s);
    }
}
