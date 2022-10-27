package Xau_Ki_Tu;

import java.util.Scanner;

public class So_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            int n = check(s);
            if(n==1) System.out.println("YES");
            else if(n==0) System.out.println("NO");
            else System.out.println("INVALID");
        }
    }
    public static int check(String s) {
        if(s.charAt(0)=='0') return -1;
        int chan = 0, le = 0;
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) return -1;
            if((s.charAt(i)-48)%2==0) chan++;
            else le++;
        }
        if( (chan>le && s.length()%2==0) || (le>chan && s.length()%2!=0)) return 1;
        return 0;
    }
}
