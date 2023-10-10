package Ung_dung_JAVA_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So_0_va_9 {
    public static ArrayList<Long> l = new ArrayList<>();
    static long[] ans = new long[101];
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            System.out.println(ans[n]);
        }
    }
    public static void init() {
        Queue<String> q = new LinkedList<>();
        q.add("9");
        l.add(Long.parseLong("9"));
        while (true) {
            String a = q.poll();
            if(a != null && a.length() == 11) break;
            q.add(a+"0");
            q.add(a+"9");
            l.add(Long.parseLong(a+"0"));
            l.add(Long.parseLong(a+"9"));
        }
        for(int i = 1; i <= 100; i++) {
            for(long x : l) {
                if(x % i == 0) {
                    ans[i] = x;
                    break;
                }
            }
        }

    }
}
