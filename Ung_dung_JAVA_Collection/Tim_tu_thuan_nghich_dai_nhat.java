package Ung_dung_JAVA_Collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Tim_tu_thuan_nghich_dai_nhat {
    public static boolean Ktra(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
      //  ArrayList<String> l = new ArrayList<>();
        LinkedHashMap<String,Integer> ma = new LinkedHashMap<>();
        int len_max = 0;
        while (sc.hasNext()) {
            String t = sc.next();
            if(Ktra(t)) {
                ma.put(t,ma.getOrDefault(t,0)+1);
                len_max = Math.max(len_max,t.length());
            }
        }
        for(String x : ma.keySet()) {
            if(x.length()==len_max ) {
                System.out.println(x + " " + ma.get(x));
            }
        }
    }
}
