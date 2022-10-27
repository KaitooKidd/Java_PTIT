package MANG;

import java.util.Scanner;

public class So_ko_lien_ke {
    public static boolean check1(String s){
        for(int i = 0; i < s.length()-1;i++)
        {
            if(Math.abs((s.charAt(i)-48) -(s.charAt(i+1)-48))!= 2)
                return false;
        }
        return true;
    }
    public static boolean check2(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
            sum += s.charAt(i)-48;
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            t--;
            String s = sc.next();
            if(So_ko_lien_ke.check1(s) && So_ko_lien_ke.check2(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
