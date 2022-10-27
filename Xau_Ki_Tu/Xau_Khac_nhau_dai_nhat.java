package Xau_Ki_Tu;

import java.util.Objects;
import java.util.Scanner;

public class Xau_Khac_nhau_dai_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String a = sc.next();
            String b = sc.next();
            if(Objects.equals(a, b)) System.out.println("-1");
            else System.out.println(Math.max(a.length(),b.length()));
        }
    }
}
