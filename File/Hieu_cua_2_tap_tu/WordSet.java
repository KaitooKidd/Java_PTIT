package File.Hieu_cua_2_tap_tu;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.util.TreeSet;

public class WordSet {
    private String s;
    public WordSet() {
    }
    public WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(s));
        String res = "";
        while (sc.hasNext()) {
            res += sc.nextLine().toLowerCase()+" ";
        }
        this.s = res;
    }

    @Override
    public String toString() {
        return this.s;
    }
    public TreeSet<String> xuli(String s) {
        String[] a = s.split("\\s");
        return new TreeSet<>(Arrays.asList(a));
    }
    public WordSet difference(WordSet a) {
        TreeSet<String> ts1 = new TreeSet<>(),ts2 = new TreeSet<>();
        ts1.addAll(xuli(this.s));
        ts2.addAll(xuli(a.s));
        WordSet kq = new WordSet();
        kq.s = "";
        for(String i : ts1) {
            if(!ts2.contains(i))
                kq.s += i + " ";
        }
        //kq.s.trim();
        return kq;
    }
}

