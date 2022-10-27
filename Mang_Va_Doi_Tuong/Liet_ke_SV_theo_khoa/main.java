package Mang_Va_Doi_Tuong.Liet_ke_SV_theo_khoa;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<Integer, ArrayList<SV>> ma = new HashMap<>();
        while (n-->0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SV s = new SV(id,name,lop,email);
            int h = Integer.parseInt(s.getLop().substring(1,3));
            if (ma.get(h) != null) {
                ma.get(h).add(s);
            } else {
                ArrayList<SV> L = new ArrayList<>();
                L.add(s);
                ma.put(h,L);
            }
        }
        int t = sc.nextInt();
        while (t-->0) {
            int k = sc.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA "+k+":");
            for(SV i : ma.get(k%100)) {
                System.out.println(i);
            }
        }
    }
}
