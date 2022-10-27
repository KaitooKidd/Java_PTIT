package Xau_Ki_Tu;

import java.util.Scanner;

public class So_dep1 {
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
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if((int)s.charAt(i) % 2 != 0)
                return false;
        }
        return true;
    }
}
