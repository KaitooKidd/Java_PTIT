package Xau_Ki_Tu;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Chuan_hoa2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t>0)
        {
            String S = in.nextLine();
            System.out.println(xuli(S));
            t--;
        }
    }
    public static String xuli(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder  kq = new StringBuilder();
        String t = st.nextToken();
        while (st.hasMoreTokens()){
            String m = st.nextToken();
            kq.append(Character.toUpperCase(m.charAt(0)));
            for(int i = 1; i < m.length(); i++) {
                kq.append(Character.toLowerCase(m.charAt(i)));
            }
            kq.append(" ");
        }
        String res = kq.toString().trim();
        res += ", " + t.toUpperCase();
        return res;
    }
}
