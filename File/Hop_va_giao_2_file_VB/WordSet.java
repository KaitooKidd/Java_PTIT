package File.Hop_va_giao_2_file_VB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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
        TreeSet<String> t = new TreeSet<>();
        String a[] = s.split("\\s");
        for(String i : a) t.add(i);
        return t;
    }
    public WordSet union(WordSet a) {
        TreeSet<String> ts = new TreeSet<>();
        ts.addAll(xuli(this.s));
        ts.addAll(xuli(a.s));
        WordSet kq = new WordSet();
        kq.s = "";
        for(String i : ts) kq.s+=i+" ";
        return kq;
    }
    public WordSet intersection(WordSet a) {
        TreeSet<String> t1 = new TreeSet<>();
        TreeSet<String> t2 = new TreeSet<>();
        t1.addAll(xuli(this.s)); t2.addAll(xuli(a.s));
        WordSet kq = new WordSet();
        kq.s = "";
        for(String i : t1) {
            if(t2.contains(i))
                kq.s+=i+" ";
        }
        return kq;
    }
}
