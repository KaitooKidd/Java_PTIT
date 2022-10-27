package Java_co_ban;

import java.util.Scanner;

public class Chu_so_4_ {
    public static String solve(String s){
        int dem1 = 0, dem2 = 0;
        for(int i = 0; i  < s.length();i++)
        {
            if(s.charAt(i) == '4') dem1++;
            if(s.charAt(i) == '7') dem2++;
        }
        int dem = dem1+dem2;
        if(dem == 4 || dem == 7) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Chu_so_4_.solve(s));
    }
}
