package Mang_Va_Doi_Tuong.Sap_xep_DS_GV;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Giang_Vien> L = new ArrayList<>();
        while (n-->0) {
            L.add(new Giang_Vien(sc.nextLine(),sc.nextLine()));
        }
        L.sort(new Comparator<Giang_Vien>() {
            @Override
            public int compare(Giang_Vien o1, Giang_Vien o2) {
                if(!Objects.equals(o1.getName(), o2.getName()))
                    return o1.getName().compareTo(o2.getName());
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(Giang_Vien x : L)
            System.out.println(x);
    }
}
