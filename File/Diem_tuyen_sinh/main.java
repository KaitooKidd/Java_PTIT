package File.Diem_tuyen_sinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<Thi_sinh> l = new ArrayList<>();
        int t  = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            l.add(new Thi_sinh(sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        l.sort(new Comparator<Thi_sinh>() {
            @Override
            public int compare(Thi_sinh o1, Thi_sinh o2) {
                if(o1.getDiem_thi() > o2.getDiem_thi())
                    return -1;
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(Thi_sinh i : l) System.out.println(i);
    }
}
