package File;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class So_thuan_nghich_trong_file {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream os2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> l1 = (ArrayList<Integer>) os1.readObject();
        ArrayList<Integer> l2 = (ArrayList<Integer>) os2.readObject();
        TreeMap<Integer,Integer> ma = new TreeMap<>();
        for(int i : l1) {
            if(check(Integer.toString(i))) ma.put(i,ma.getOrDefault(i,0)+1);
        }
        for(int i : l2) {
            if(ma.containsKey(i)) {
                ma.put(i,ma.get(i)+1);
            }
        }
        int count = 0;
        for(int i : ma.keySet()) {
            if (l2.contains(i)) {
                System.out.println(i + " " + ma.get(i));
                count++;
                if (count == 10) break;
            }
        }
    }
    public static boolean check(String s) {
        if(s.length() == 1 || s.length()%2==0) return false;
        for(int i = 0; i <= s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i) || (s.charAt(i) - '0') % 2 == 0)
                return false;
        }
        return true;
    }
}



