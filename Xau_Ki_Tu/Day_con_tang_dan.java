package Xau_Ki_Tu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day_con_tang_dan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        ArrayList<Integer> l = new ArrayList<>();
        while (sc.hasNext()) {
            l.add(sc.nextInt());
        }
        int n = l.get(0);
        l.remove(0);
        ArrayList<String> V = new ArrayList<>();
        ArrayList<Integer> v1 = new ArrayList<>();
        for(int i = 0; i < (1 << n); i++)
        {
            for(int j = 0; j < n; j++)
            {
                if((i & (1 << j)) != 0)
                    v1.add(l.get(j));
            }
            if(check(v1)) {
                StringBuilder tmp= new StringBuilder();
                for(int d : v1)
                    tmp.append(d).append(" ");
                V.add(tmp.toString().trim());
            }
            v1.clear();
        }
        Collections.sort(V);
        for(String i : V) System.out.println(i);
    }
    public static boolean check(ArrayList<Integer> v1) {
        if(v1.size() < 2) return false;
        for(int i = 0; i < v1.size() - 1; i++)
        {
            if(v1.get(i) > v1.get(i+1)) return false;
        }
        return true;
    }
}
