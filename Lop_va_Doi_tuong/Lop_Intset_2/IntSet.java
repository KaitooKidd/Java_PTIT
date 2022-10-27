package Lop_va_Doi_tuong.Lop_Intset_2;

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
    public IntSet intersection(IntSet s) {
        TreeSet<Integer> t1 = new TreeSet<>();
        TreeSet<Integer> t2 = new TreeSet<>();
        for(int i : this.a) t1.add(i);
        for(int i : s.a) t2.add(i);
        IntSet x = new IntSet();
        int[] b = new int[100];
        int dem = 0;
        for(Integer i : t1) {
            if(t2.contains(i))
                b[dem++] = i;

        }
        x.a = Arrays.copyOf(b,dem);
        return x;
    }
}
