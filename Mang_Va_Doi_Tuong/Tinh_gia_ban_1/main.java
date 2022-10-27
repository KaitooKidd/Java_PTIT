package Mang_Va_Doi_Tuong.Tinh_gia_ban_1;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Mat_Hang> l = new ArrayList<>();
        while (t-->0) {
           l.add(new Mat_Hang(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        l.sort(new Comparator<Mat_Hang>() {
            @Override
            public int compare(Mat_Hang o1, Mat_Hang o2) {
                if(o1.getGia_ban()>o2.getGia_ban())
                    return -1;
                return 1;
            }
        });
        for(Mat_Hang i : l)
            System.out.println(i);
    }
}
