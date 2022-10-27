package File.Xep_loai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_vien> l = new ArrayList<>();
        while (t-->0) {
            l.add(new Sinh_vien(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        l.sort(new Comparator<Sinh_vien>() {
            @Override
            public int compare(Sinh_vien o1, Sinh_vien o2) {
                if(o1.getTrung_binh() > o2.getTrung_binh())
                    return -1;
                return 1;
            }
        });
        for(Sinh_vien i : l) System.out.println(i);
    }
}
