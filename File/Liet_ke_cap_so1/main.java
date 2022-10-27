package File.Liet_ke_cap_so1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obs = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> l = (ArrayList<Pair>) obs.readObject();
        ArrayList<Pair> ll = new ArrayList<>();
        for (Pair i : l) {
            if (check(i) && !ll.contains(i)) {
                ll.add(i);
            }
        }
        Collections.sort(ll);
        for(Pair i : ll) System.out.println(i);
    }
    public static boolean check(Pair i) {
        return i.getFirst() < i.getSecond();
    }
}
