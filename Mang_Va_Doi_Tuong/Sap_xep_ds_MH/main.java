package Mang_Va_Doi_Tuong.Sap_xep_ds_MH;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList< Mat_Hang> M = new ArrayList<>();
        while (n-->0) {
            sc.nextLine();
            M.add(new Mat_Hang(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble()));
        }
        Collections.sort(M);
        for(Mat_Hang i : M)
            System.out.println(i);
    }
}
