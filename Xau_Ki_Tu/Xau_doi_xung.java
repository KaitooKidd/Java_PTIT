package Xau_Ki_Tu;

import java.util.Scanner;

public class Xau_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            if(doi_xung(s)) {
                if(s.length()%2!=0) {
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            else {
                if(check(s)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    public static boolean doi_xung(String s) {
        int l = s.length();
        for(int i = 0; i < l/2; i++) {
            if(s.charAt(i) != s.charAt(l-1-i))
                return false;
        }
        return true;
    }
    public static boolean check(String s) {
        int l = s.length();
        String res="";
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(l-1-i))
            {
               res+=s.substring(0,i)+s.charAt(l-1-i)+s.substring(i+1);
               break;
            }
        }
        return doi_xung(res);
    }
}
