package Mang_Va_Doi_Tuong.Danh_sach_Doanh_nghiep_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Doanh_Nghiep> L = new ArrayList<>();
        while (n-->0) {
            L.add(new Doanh_Nghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        L.sort(new Comparator<Doanh_Nghiep>() {
            @Override
            public int compare(Doanh_Nghiep o1, Doanh_Nghiep o2) {
                if(o1.getCount() > o2.getCount())
                    return -1;
                if(o1.getCount() == o2.getCount())
                    return o1.getId().compareTo(o2.getId());
                return 1;
            }
        });
        int t = sc.nextInt();
        while (t-->0) {
            int a,b;
            a = sc.nextInt(); b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for (Doanh_Nghiep i : L) {
                if (i.getCount() >= a && i.getCount() <= b)
                    System.out.println(i);
            }
        }
    }
}

