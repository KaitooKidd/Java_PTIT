package Mang_Va_Doi_Tuong.Danh_sach_GV_theo_Mon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, ArrayList<GV>> ma = new HashMap<>();
        while (n-->0) {
            String name = sc.nextLine();
            String nganh = sc.nextLine();
            GV g = new GV(name,nganh);
            if(ma.get(g.getNganh()) != null) {
                ma.get(g.getNganh()).add(g);
            }
            else {
                ArrayList<GV> L = new ArrayList<>();
                L.add(g);
                ma.put(g.getNganh(),L);
            }
        }
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String ng = sc.nextLine();
            ng = ng.toUpperCase();
            String arr[] = ng.split("\\s");
            ng="";
            for(int i = 0; i < arr.length; i++) {
                ng+=arr[i].charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+ng+":");
            for(GV i : ma.get(ng)) {
                System.out.println(i);
            }
        }
    }
}
