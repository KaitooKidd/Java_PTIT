package Mang_Va_Doi_Tuong.So_phuc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // ArrayList<SO_PHUC> L = new ArrayList<>();
        while (n-->0) {
            SO_PHUC a = new SO_PHUC(sc.nextInt(),sc.nextInt());
            SO_PHUC b = new SO_PHUC(sc.nextInt(),sc.nextInt());
            SO_PHUC c = a.add(b).mutil(a);
            SO_PHUC d = a.add(b).mutil(a.add(b));
            System.out.println(c+", "+d);
        }
    }
}
