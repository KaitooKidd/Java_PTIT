package Mang_Va_Doi_Tuong.Danh_sach_Doanh_nghiep_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Doanh_nghiep> L = new ArrayList<>();
        while (n-->0) {
            L.add(new Doanh_nghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        L.sort(new Comparator<Doanh_nghiep>() {
            @Override
            public int compare(Doanh_nghiep o1, Doanh_nghiep o2) {
                if(o1.getCount() > o2.getCount())
                    return -1;
                if(o1.getCount() == o2.getCount())
                    return o1.getId().compareTo(o2.getId());
                return 1;
            }
        });
        for(Doanh_nghiep i : L)
            System.out.println(i);
    }
}
