package MANG;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bo_sung_ptu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> X = new HashSet<>();
        int maxx = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            maxx = Math.max(maxx, a);
            X.add(a);
        }
        int a = 0;
        for (int i = 1; i <= maxx; i++) {
            if (!X.contains(i)) {
                System.out.println(i);
                a++;
            }
        }
        if (a == 0) System.out.println("Excellent!");
    }
}
