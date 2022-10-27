package Mang_Va_Doi_Tuong.Bang_diem_Hoc_sinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Hoc_Sinh> L = new ArrayList<>();
        while (t-->0) {
            L.add(new Hoc_Sinh(sc.nextLine(), sc.nextLine().split("\\s+")));
        }
        Collections.sort(L,new Comparator<Hoc_Sinh>() {
            @Override
            public int compare(Hoc_Sinh a, Hoc_Sinh b)
            {
                if(a.getTb() < b.getTb())
                    return 1;
                if(a.getTb()==(b.getTb())) {
                    if (a.getId().compareTo(b.getId()) > 0)
                        return 1;
                }
                return -1;
            }
        });
        for(Hoc_Sinh i : L)
            System.out.println(i);
    }
}
