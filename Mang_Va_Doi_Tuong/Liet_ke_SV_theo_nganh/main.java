package Mang_Va_Doi_Tuong.Liet_ke_SV_theo_nganh;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<SV>> ma = new HashMap<>();
        while (n-->0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SV s = new SV(id,name,lop,email);
            String m = s.getId().substring(5,7);
            if (ma.get(m) != null) {
                ma.get(m).add(s);
            } else {
                ArrayList<SV> L = new ArrayList<>();
                L.add(s);
                ma.put(m,L);
            }
        }
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String k = sc.nextLine();
            k = k.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH "+k+":");
            String res = chuanhoa(k);
            if(ma.get(res) != null) {
                for (SV i : ma.get(res)) {
                    if (Objects.equals(res, "CN") || Objects.equals(res, "AT")) {
                        if (i.getLop().charAt(0) != 'E') {
                            System.out.println(i);
                        }
                    } else System.out.println(i);
                }
            }
        }
    }

    public static String chuanhoa(String s) {
        String ans[] = s.split("\\s");
        String res="";
        for(int i = 0; i < 2; i++) {
            res += ans[i].charAt(0);
        }
        return res;
    }
}
