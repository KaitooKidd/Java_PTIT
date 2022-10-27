package Mang_Va_Doi_Tuong.Tre_nhat_Gia_nhat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<People> L = new ArrayList<>();
        while (n-->0) {
            L.add(new People(sc.next(),sc.next()));
        }
        L.sort(new Comparator<People>() {
            public int compare(People a, People b) {
                return a.getDateOfBirth().compareTo(b.getDateOfBirth());
            }
        });
        System.out.println(L.get(L.size()-1)+"\n"+L.get(0));
    }
}
