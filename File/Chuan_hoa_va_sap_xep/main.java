package File.Chuan_hoa_va_sap_xep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Person> l = new ArrayList<>();
        while (sc.hasNext()) {
            l.add(new Person(sc.nextLine()));
        }
        Collections.sort(l);
        for(Person i : l) System.out.println(i);
    }
}
