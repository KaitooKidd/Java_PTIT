package File.DS_luu_tru;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KH> L = new ArrayList<>();
        while (n-->0) {
            L.add(new KH(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(L, new Comparator<KH>() {
            @Override
            public int compare(KH o1, KH o2) {
                if(o1.getLuu_tru() > o2.getLuu_tru())
                    return -1;
                return 1;
            }
        });
        for(KH i : L) System.out.println(i);
    }
}
