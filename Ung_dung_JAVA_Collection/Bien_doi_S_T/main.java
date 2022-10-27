package Ung_dung_JAVA_Collection.Bien_doi_S_T;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int S = sc.nextInt(), T = sc.nextInt();
            System.out.println(solve(S, T));
        }
    }

    public static int solve(int S, int T) {
        HashSet<Integer> hs = new HashSet<>();
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(S, 0));
        hs.add(S);
        while (q.size() > 0) {
            Pair<Integer, Integer> p = q.poll();
            int a = p.getFirst();
            int b = p.getSecond();
            if (a == T) return b;
            if (a * 2 == T || a - 1 == T) return b + 1;
            if (a < T && !hs.contains(a * 2)) {
                q.add(new Pair<>(a * 2, b + 1));
                hs.add(a * 2);
            }
            if (a - 1 >= 0 && !hs.contains(a - 1)) {
                q.add(new Pair<>(a - 1, b + 1));
                hs.add(a - 1);
            }
        }
        return -1;
    }
}
