package Mang_Va_Doi_Tuong.Danh_sach_thuc_tap1;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, ArrayList<Sinh_vien>> ma = new HashMap<>();
        while (n-- > 0) {
            String id, name, lop, email, cty;
            id = sc.nextLine();
            name = sc.nextLine();
            lop = sc.nextLine();
            email = sc.nextLine();
            cty = sc.nextLine();
            Sinh_vien s = new Sinh_vien(id, name, lop, email, cty);
            if (ma.get(s.getCty()) != null) {
                ma.get(s.getCty()).add(s);
            } else {
                ArrayList<Sinh_vien> l = new ArrayList<>();
                l.add(s);
                ma.put(s.getCty(), l);
            }
        }
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String k = sc.nextLine();
            if (ma.get(k) != null) {
                Collections.sort(ma.get(k), new Comparator<Sinh_vien>() {
                    @Override
                    public int compare(Sinh_vien o1, Sinh_vien o2) {
                        //return o1.getName().compareTo(o2.getName());
                        return o1.getId().compareTo(o2.getId());
                    }
                });
                for (Sinh_vien i : ma.get(k)) {
                    System.out.println(i);
                }
            }
        }
    }
}
