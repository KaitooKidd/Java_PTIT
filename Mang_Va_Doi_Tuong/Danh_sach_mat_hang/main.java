package Mang_Va_Doi_Tuong.Danh_sach_mat_hang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Mat_hang> L = new ArrayList<>();
        while (n-->0) {
            L.add(new Mat_hang(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(L, new Comparator<Mat_hang>() {
            @Override
            public int compare(Mat_hang o1, Mat_hang o2) {
                if(o1.getLoi_nhuan() != o2.getLoi_nhuan())
                    return (int)(o2.getLoi_nhuan() - o1.getLoi_nhuan());
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(Mat_hang i : L)
            System.out.println(i);
    }
}
