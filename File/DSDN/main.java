package File.DSDN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Doanh_nghiep> L = new ArrayList<>();
        while (n-->0) {
            L.add(new Doanh_nghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        L.sort(new Comparator<Doanh_nghiep>() {
            @Override
            public int compare(Doanh_nghiep o1, Doanh_nghiep o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(Doanh_nghiep i : L)
            System.out.println(i);
    }
}
