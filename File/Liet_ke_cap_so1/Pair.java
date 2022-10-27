package File.Liet_ke_cap_so1;

import java.io.*;

public class Pair implements Serializable, Comparable<Pair> {
    private int first,second;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair o) {
        return this.first-o.first;
    }
    public String toString() {
        return "("+first+", "+second+")";
    }
}