package File.Tinh_tien_dien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Gia_dinh> l = new ArrayList<>();
        while (t-->0) {
            l.add(new Gia_dinh(sc.nextLine(),sc.nextLine()));
        }
        l.sort(new Comparator<Gia_dinh>() {
            @Override
            public int compare(Gia_dinh o1, Gia_dinh o2) {
               if(o1.getTien_nop() > o2.getTien_nop())
                   return -1;
               return 1;
            }
        });
        for(Gia_dinh i : l) System.out.println(i);
    }
}
