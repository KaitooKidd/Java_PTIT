package MANG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Day_con_lien_tiep_tong_bang_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-->0) {
            long n = sc.nextLong(), k = sc.nextLong();
            ArrayList<Long> l = new ArrayList<>();
            HashSet<Long> st = new HashSet<>();
            for(int i = 0; i < n; i++) {
                if(i==0) l.add(sc.nextLong());
                else l.add(l.get(i-1)+sc.nextLong());
                st.add(l.get(i));
            }
            if (check(l,n,k,st)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(ArrayList<Long>l,long n, long k, HashSet<Long>st) {
        if(l.contains(k)) return true;
        if(k==0) return false;
        for(int i = 0; i < n; i++) {
            long len = st.size();
            st.add(l.get(i)+k);
            if(st.size() == len) return true;
            st.remove(l.get(i)+k);
        }
        return false;
    }
}
