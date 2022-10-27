package File.Liet_ke_tu_khac_nhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordSet {
    private File f;

    @Override
    public String toString() {
        String res="";
        for(String s : st) res +=s+"\n";
        return res;
    }

    private TreeSet<String> st= new TreeSet<>();
    public WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String line[] = sc.nextLine().split("\\s");
            for(String i : line) st.add(i.toLowerCase());
        }
    }

}
