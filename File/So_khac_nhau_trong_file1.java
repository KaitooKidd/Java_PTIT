package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class So_khac_nhau_trong_file1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer,Integer> ma = new TreeMap<>();
        while (sc.hasNext()) {
            int t = sc.nextInt();
            ma.put(t,ma.getOrDefault(t,0)+1);
        }
        for(int i : ma.keySet()) {
            System.out.println(i+" "+ma.get(i));
        }
    }
}
