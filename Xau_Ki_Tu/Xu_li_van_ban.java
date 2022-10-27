package Xau_Ki_Tu;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Xu_li_van_ban {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringBuilder a= new StringBuilder();
        ArrayList<String> S=new ArrayList<>();
        while(scan.hasNext()){
            String s= scan.next();
            if(s.charAt(s.length()-1)=='.'||s.charAt(s.length()-1)=='!'||s.charAt(s.length()-1)=='?') {
                a.append(s, 0, s.length() - 1);
                S.add(a.toString().trim().toLowerCase());
                a = new StringBuilder();
            }
            else a.append(s).append(" ");

        }
        for(String x:S) {
            for(int i=0;i<x.length();i++)
                if(i==0) System.out.print(Character.toUpperCase(x.charAt(0)));
                else System.out.print(x.charAt(i));
            System.out.println();
        }

    }
}
