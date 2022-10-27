package Mang_Va_Doi_Tuong.Tinh_gio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Game> G = new ArrayList<>();
        while (n-->0) {
            G.add(new Game(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(G);
        for(Game g : G)
            System.out.println(g);
    }
}
