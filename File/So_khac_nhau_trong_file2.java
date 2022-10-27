package File;

import java.io.*;
import java.util.TreeMap;

public class So_khac_nhau_trong_file2 {
    public static void main(String[] args) throws IOException {
        DataInputStream is = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> ma = new TreeMap<>();
        for (int i = 0; i < 100000; i++) {
            int res = is.readInt();
            ma.put(res, ma.getOrDefault(res, 0) + 1);
        }
        for (int i : ma.keySet()) {
            System.out.println(i + " " + ma.get(i));
        }
    }
}
