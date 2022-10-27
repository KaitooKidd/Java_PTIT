package File.DS_ca_thi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        ArrayList<Ca_thi> l = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            l.add(new Ca_thi(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(Ca_thi i : l) System.out.println(i);
    }
}
