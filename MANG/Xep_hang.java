package MANG;

import java.util.Arrays;
import java.util.Scanner;

class Khach_hang implements Comparable<Khach_hang>{
    private int den, di;

    public Khach_hang(int x, int y) {
        this.den = x;
        this.di = y;
    }

    public void setDi(int di) {
        this.di = di;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getDen() {
        return this.den;
    }

    public int getDi() {
        return this.di;
    }

    public int compareTo(Khach_hang a) {
        return this.den - a.den;
    }
}

public class Xep_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        Khach_hang[] K = new Khach_hang[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            K[i] = new Khach_hang(x, y);
        }
        Arrays.sort(K, Khach_hang::compareTo);
        // int res = K[0].getDen() + K[0].getDi();
        for (int i = 0; i < n-1; i++) {
            if (K[i].getDi()+K[i].getDen() > K[i+1].getDen())
                K[i+1].setDen(K[i].getDi() + K[i].getDen());
            //else res += K[i].getDi();
        }
        System.out.print(K[n-1].getDen() + K[n-1].getDi());
    }
}
