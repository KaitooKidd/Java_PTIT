package Ung_dung_JAVA_Collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

    public class Liet_ke_va_dem {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner sc = new Scanner(System.in);
            LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
            while (sc.hasNext()) {
                String t = sc.next();
                if (check(t)) {
                    int k = Integer.parseInt(t);
                    hm.put(k, hm.getOrDefault(k, 0) + 1);
                }
            }
            List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hm.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });
            for(Map.Entry<Integer,Integer> e : list)
                System.out.println(e.getKey()+" "+e.getValue());
        }
        public static boolean check(String s) {
            for(int i = 1; i < s.length(); i++) {
                if(s.charAt(i) < s.charAt(i-1))
                    return false;
            }
            return true;
        }
    }

