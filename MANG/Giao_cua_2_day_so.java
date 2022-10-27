package MANG;

import java.util.*;

public class Giao_cua_2_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int t;
        Set<Integer> s1 = new TreeSet<>(), s2 = new TreeSet<>();
        Vector<Integer> a1 = new Vector<>(), a2 = new Vector<>();
        for(int i = 0; i < n; i++)
        {
            t = sc.nextInt();
            s1.add(t);
        }
        for(int i = 0; i < m; i++)
        {
            t = sc.nextInt();
            s2.add(t);
        }
        a1.addAll(s1);
        a2.addAll(s2);
        int i = 0, j = 0;
        while(i < a1.size() && j < a2.size())
        {
            if(a1.get(i).equals(a2.get(j)))
            {
                System.out.print(a1.get(i) + " ");
                i++; j++;
            }
            else if(a1.get(i) < a2.get(j)) i++;
            else j++;
        }
    }
}
