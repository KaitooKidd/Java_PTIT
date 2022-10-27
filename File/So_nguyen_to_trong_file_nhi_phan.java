package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class So_nguyen_to_trong_file_nhi_phan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> L = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer,Integer> ma = new TreeMap<>();
        for(int i : L) {
            if(Isprime(i)) {
                ma.put(i,ma.getOrDefault(i,0)+1);
            }
        }
        for(int i : ma.keySet()) {
            System.out.println(i+" "+ma.get(i));
        }
    }
    public static boolean Isprime(int n) {
        if(n<2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
