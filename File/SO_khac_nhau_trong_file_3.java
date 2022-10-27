package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class SO_khac_nhau_trong_file_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obs = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> l = (ArrayList<Integer>) obs.readObject();
        TreeMap<Integer,Integer> ma = new TreeMap<>();
        for(int x : l) {
            ma.put(x,ma.getOrDefault(x,0)+1);
        }
        for(int x : ma.keySet()) {
            System.out.println(x+" "+ma.get(x));
        }
    }
}
