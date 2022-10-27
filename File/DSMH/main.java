package File.DSMH;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int  n = Integer.parseInt(sc.nextLine());
        ArrayList<Mon_hoc> l = new ArrayList<>();
        while (n-->0) {
            l.add(new Mon_hoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(l, new Comparator<Mon_hoc>() {
            @Override
            public int compare(Mon_hoc o1, Mon_hoc o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Mon_hoc i : l) System.out.println(i);
    }
}
