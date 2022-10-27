package Mang_Va_Doi_Tuong.Bang_xep_hang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_vien> l = new ArrayList<>();
        while (t-->0) {
            l.add(new Sinh_vien(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(Sinh_vien i : l) System.out.println(i);
    }
}
