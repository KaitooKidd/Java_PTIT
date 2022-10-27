package Xau_Ki_Tu;

import java.util.Scanner;

public class So_dep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            if(ktra(s)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
    public static boolean ktra(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '2' & s.charAt(i) != '3' & s.charAt(i) != '5' & s.charAt(i) != '7')
                return false;
        }
        for(int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
