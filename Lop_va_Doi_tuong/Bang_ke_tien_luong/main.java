package Lop_va_Doi_tuong.Bang_ke_tien_luong;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Nhan_Vien> l = new ArrayList<>();
        while (t-->0) {
            l.add(new Nhan_Vien(sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()),sc.nextLine()));
        }
        l.sort(new Comparator<Nhan_Vien>() {
            @Override
            public int compare(Nhan_Vien o1, Nhan_Vien o2) {
                if(o1.getThuc_linh() > o2.getThuc_linh())
                    return -1;
                return 1;
            }
        });
        for(Nhan_Vien i : l) System.out.println(i);
//        long sum = 0;
//        for(Nhan_Vien i : l) {
//            System.out.println(i);
//            sum += i.getThuc_linh();
//        }
     //   System.out.println("Tong chi phi tien luong: "+sum);
    }
}
