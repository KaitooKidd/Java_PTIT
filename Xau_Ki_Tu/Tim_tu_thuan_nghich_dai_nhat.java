package Xau_Ki_Tu;

import java.util.*;

public class Tim_tu_thuan_nghich_dai_nhat {
    public static boolean tn(String s){
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> S = new ArrayList<>();
        TreeMap<String,Integer> ma = new TreeMap<>();
        while (scan.hasNext()) {
            String s = scan.next();
            if (tn(s)) {
                S.add(s);
                ma.put(s,ma.getOrDefault(s,0)+1);
            }
            if (s.isEmpty()) break;
        }
        int max_len = 0;
        for(String s : S) max_len = Math.max(max_len,s.length());
        for(String s : S) {
            if(s.length() == max_len && ma.get(s) != 0) {
                System.out.println(s + " " + ma.get(s));
                ma.put(s,0);
            }
        }
    }
}
