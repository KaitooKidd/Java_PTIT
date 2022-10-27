package File.DSKH_trong_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t= Integer.parseInt(sc.nextLine());
        ArrayList<KH> l = new ArrayList<>();
        while (t-->0) {
            l.add(new KH(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(KH i : l) System.out.println(i);
    }
}
