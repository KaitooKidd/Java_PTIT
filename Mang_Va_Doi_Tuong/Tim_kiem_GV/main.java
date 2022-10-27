package Mang_Va_Doi_Tuong.Tim_kiem_GV;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV> L = new ArrayList<>();
        while (n-->0) {
            L.add(new GV(sc.nextLine(),sc.nextLine()));
        }
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            s = s.toLowerCase();
            for(GV i : L) {
                String res = i.getFullName().toLowerCase();
                if(res.contains(s))
                    System.out.println(i);
            }
        }
    }
}
