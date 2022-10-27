package File.Tinh_diem_trung_binh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Ptit> l = new ArrayList<>();
        while (t-->0) {
            l.add(new Ptit(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        l.sort(new Comparator<Ptit>() {
            @Override
            public int compare(Ptit o1, Ptit o2) {
                if(o1.getTrung_binh() > o2.getTrung_binh())
                    return -1;
                return 1;
            }
        });
        int count = 1, dem = 1;
        System.out.println(l.get(0)+"1");
        for(int i = 1; i < l.size(); i++) {
            System.out.print(l.get(i));
            if(l.get(i).getTrung_binh() == l.get(i-1).getTrung_binh()) {
                System.out.println(count);
                dem++;
            }
            else {
                count+=dem;
                dem = 1;
                System.out.println(count);
            }
        }

    }
}
