package Mang_Va_Doi_Tuong.Liet_ke_SV_theo_lop;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String,ArrayList<SV>> ma = new HashMap<>();
        while (n-->0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SV s = new SV(id,name,lop,email);
            if (ma.get(lop) != null) {
                ma.get(lop).add(s);
            } else {
                ArrayList<SV> L = new ArrayList<>();
                L.add(s);
                ma.put(lop,L);
            }
        }
        int t = sc.nextInt();
        while (t-->0) {
            String k = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP "+k+":");
            for(SV i : ma.get(k)) {
                System.out.println(i);
            }
        }
    }
}
