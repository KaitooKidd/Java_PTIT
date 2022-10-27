package MANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day_con_co_tong_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            ArrayList<String> V = new ArrayList<>();
            ArrayList<Integer> v1 = new ArrayList<>();
            ArrayList<Integer> v2 = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int k = sc.nextInt();
                v2.add(k);
            }
            Collections.sort(v2);
            Collections.reverse(v2);
            for(int i = 0; i < (1 << n); i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if((i & (1 << j)) != 0)
                        v1.add(v2.get(j));
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
    }
    public static boolean check(ArrayList<Integer>v1) {
        int sum = 0;
        for(int i : v1) sum+=i;
        return Isprime(sum);
    }
    public static boolean Isprime(int n) {
        if(n<2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i==0) return false;
        return true;
    }
}
