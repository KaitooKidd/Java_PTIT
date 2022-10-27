package Lop_va_Doi_tuong.Danh_sach_mon_thi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Mon_thi> ls = new ArrayList<>();
        while (n-->0) {
            ls.add(new Mon_thi(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ls, new Comparator<Mon_thi>() {
            @Override
            public int compare(Mon_thi o1, Mon_thi o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (Mon_thi M : ls)
            System.out.println(M);
    }
}
