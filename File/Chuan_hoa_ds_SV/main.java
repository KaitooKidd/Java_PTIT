package File.Chuan_hoa_ds_SV;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t =  Integer.parseInt(sc.nextLine());
        ArrayList<Sinh_Vien> l = new ArrayList<>();
        while (t-->0) {
            l.add(new Sinh_Vien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        for(Sinh_Vien i : l) System.out.println(i);
    }
}
