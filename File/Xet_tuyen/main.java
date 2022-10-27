package File.Xet_tuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<People> l = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            l.add(new People(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        for(People i : l) System.out.println(i);
    }
}
