package Mang_Va_Doi_Tuong.Danh_sach_doi_tuong_NV;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Nhan_Vien> L = new ArrayList<>();
        while (n-->0) {
           L.add(new Nhan_Vien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(L, new Comparator<Nhan_Vien>() {
            @Override
            public int compare(Nhan_Vien a, Nhan_Vien b) {
                String res1 = "";
                String res2 = "";
                for (int i = 6; i <= 9; i++) {
                    res1 += a.getNgaySinh().charAt(i);
                    res2 += b.getNgaySinh().charAt(i);
                }
                for (int i = 0; i <= 1; i++) {
                    res1 += a.getNgaySinh().charAt(i);
                    res2 += b.getNgaySinh().charAt(i);
                }
                for (int i = 3; i <= 4; i++) {
                    res1 += a.getNgaySinh().charAt(i);
                    res2 += b.getNgaySinh().charAt(i);
                }
                return res1.compareTo(res2);
            }
        });
        for(Nhan_Vien i : L)
            System.out.println(i);
    }
}
