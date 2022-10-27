package Ung_dung_JAVA_Collection;

import java.util.*;

public class So_Loc_phat {
    static ArrayList<String> l = new ArrayList<>();
    static long[] ans = new long[101];
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            ArrayList<String> ll = new ArrayList<>();
            for(String x : l) {
                if(x.length() == n+1) break;
                ll.add(x);
            }
            System.out.println(ll.size());
            Collections.reverse(ll);
            for(String x : ll)
                System.out.print(x+" ");
            System.out.println();
        }
    }
    public static void init() {
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        l.add(("6"));
        l.add(("8"));
        while (true) {
            String a = q.poll();
            if(a != null && a.length() == 15) break;
            q.add(a+"6");
            q.add(a+"8");
            l.add((a+"6"));
            l.add((a+"8"));
        }

    }
}
