package MANG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day_con_co_tong_le {

    public static boolean check(ArrayList<Integer>v1) {
        int sum = 0;
        for(int i : v1) sum+=i;
        return (sum%2!=0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {

            int n = sc.nextInt();
            ArrayList<String> V = new ArrayList<>();
            ArrayList<Integer> v1=new ArrayList<>();
            ArrayList<Integer> v2 = new ArrayList<>();

            for(int i = 0; i < n; i++)  {
                int k = sc.nextInt();
                v1.add(k);
            }

            Collections.sort(v1);
            Collections.reverse(v1);

            for(int i = 0; i < (1 << n); i++) {
                for(int j = 0; j < n; j++) {
                    if((i & (1 << j)) != 0)
                        v2.add(v1.get(j));
                }
                if(check(v2)) {
                    StringBuilder tmp = new StringBuilder();
                    for(int d : v2)
                        tmp.append(d).append(" ");
                    V.add(tmp.toString().trim());
                }
                v2.clear();
            }

            Collections.sort(V);
            for(String i : V) System.out.println(i);
        }
    }
}
