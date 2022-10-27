package File;

import java.io.*;
import java.util.*;

public class Liet_ke_theo_thu_tu_xuat_hien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream obs = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> l = (ArrayList<String>) obs.readObject();
        TreeSet<String> ts = new TreeSet<>();
        for(String s : l) {
            String[] a = s.trim().toLowerCase().split("\\s+");
            ts.addAll(Arrays.asList(a));
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if(ts.contains(s)) {
                System.out.println(s);
                ts.remove(s);
            }
        }
    }
}
