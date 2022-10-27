package Lop_va_Doi_tuong.Lop_Intset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class IntSet {
    private int[] a = new int[105];

    @Override
    public String toString() {
        String s = "";
        for(int i : this.a)
            s +=i+" ";
        return s.trim();
    }

    public IntSet() {
    }

    public IntSet(int[] s) {
        this.a = Arrays.copyOf(s,s.length);
    }
    public IntSet union(IntSet s) {
        TreeSet<Integer> t = new TreeSet<>();
        for(int i : this.a) t.add(i);
        for(int i : s.a) t.add(i);
        IntSet x = new IntSet();
        int[] b = new int[t.size()];
        int dem = 0;
        for(int i : t){
            b[dem++] = i;
        }
        x.a = Arrays.copyOf(b,b.length);
        return x;
    }

}
