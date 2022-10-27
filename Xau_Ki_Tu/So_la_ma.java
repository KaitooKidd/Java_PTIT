package Xau_Ki_Tu;

import java.util.ArrayList;
import java.util.Scanner;

public class So_la_ma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            ArrayList<Integer> L = new ArrayList<>();
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='I') L.add(1);
                else if(s.charAt(i)=='V') L.add(5);
                else if(s.charAt(i)=='X') L.add(10);
                else if(s.charAt(i) == 'L') L.add(50);
                else if(s.charAt(i) == 'C') L.add(100);
                else if(s.charAt(i)=='D') L.add(500);
                else L.add(1000);
            }
            int ans = L.get(L.size()-1);
           for(int i = L.size()-2; i >= 0; i--) {
                if(L.get(i) >= L.get(i+1)) ans += L.get(i);
                else ans -= L.get(i);
           }
            System.out.println(ans);

        }
    }
}
