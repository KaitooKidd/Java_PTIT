package Xau_Ki_Tu;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tap_tu_rieng_2_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            TreeSet<String> s1 = new TreeSet<>(),s2 = new TreeSet<>();
            String[] a = sc.nextLine().split("\\s");
            String[] b = sc.nextLine().split("\\s");
            Collections.addAll(s1,a);
            Collections.addAll(s2,b);
            for(String s : s1) {
                if(!s2.contains(s)) {
                    System.out.print(s+" ");
                }
            }
            System.out.println();
        }
    }
}
