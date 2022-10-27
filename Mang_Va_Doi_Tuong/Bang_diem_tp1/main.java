package Mang_Va_Doi_Tuong.Bang_diem_tp1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_Vien> L = new ArrayList<>();
        while (n-->0) {
            L.add(new Sinh_Vien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
        L.sort(new Comparator<Sinh_Vien>() {
            @Override
            public int compare(Sinh_Vien o1, Sinh_Vien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        int count = 0;
        for(Sinh_Vien i : L) {
            System.out.println(++count+" "+i);
        }
    }
}
