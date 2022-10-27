package Xau_Ki_Tu;

import java.util.Scanner;

public class So_dep2 {
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
        int len = s.length(), sum = 0;
        if(s.charAt(0) != '8' | s.charAt(len-1) != '8')
            return false;
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len-1-i))
                return false;
        }
        for(int i = 0; i < len; i++) {
            int t = s.charAt(i)-48;
            sum += t;
        }
        return sum%10==0;
   }
}