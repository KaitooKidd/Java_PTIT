package File.Tinh_tien_phong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khach_hang> l = new ArrayList<>();
        while (t-->0) {
            l.add(new Khach_hang(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(l);
        for(Khach_hang i : l) System.out.println(i);
    }
}
