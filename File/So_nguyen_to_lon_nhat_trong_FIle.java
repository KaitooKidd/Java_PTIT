package File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class So_nguyen_to_lon_nhat_trong_FIle {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> l = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer,Integer> ma = new TreeMap<>();
        for(int i : l) {
            if(Isprime(i)) {
                ma.put(i,ma.getOrDefault(i,0)+1);
            }
        }
        int count = 0;
        for(int i : ma.descendingKeySet()) {
            System.out.println(i+" "+ma.get(i));
            count++;
            if(count==10) break;
        }
    }
    public static boolean Isprime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
