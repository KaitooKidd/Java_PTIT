package File.Thoi_gian_OnLine;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
public class main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("ONLINE.in"));
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<Sinh_vien> SV = new ArrayList<>();
            while(n-- > 0) {
                SV.add(new Sinh_vien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            Collections.sort(SV);
            for(Sinh_vien i: SV)
                System.out.println(i);
        }
        catch (FileNotFoundException | ParseException e) {

        }
    }
}
