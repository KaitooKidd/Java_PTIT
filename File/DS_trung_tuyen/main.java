package File.DS_trung_tuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Thi_sinh> l = new ArrayList<>();
        while (t-->0) {
            l.add(new Thi_sinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        int n = Integer.parseInt(sc.nextLine());
        l.sort(new Comparator<Thi_sinh>() {
            @Override
            public int compare(Thi_sinh o1, Thi_sinh o2) {
                if(o1.getSum() > o2.getSum())
                    return -1;
                return o1.getId().compareTo(o2.getId());
            }
        });
        double diem_chuan = l.get(n-1).getSum();
        System.out.println(String.format("%.1f",diem_chuan));
        for(Thi_sinh x : l) {
            x.tooString();
            if(x.getSum() >= diem_chuan) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
        }

    }
}
