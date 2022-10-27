package Xau_Ki_Tu;

import java.util.Scanner;
import java.util.Stack;

public class Dao_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String[]s = sc.nextLine().split("\\s+");
            for(int i = 0; i < s.length; i++) {
                System.out.print(xuli(s[i])+" ");
            }
            System.out.println();
        }
    }
    public static String xuli(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
            st.push(s.charAt(i));
        String res="";
        while (!st.empty()) {
            res+=st.pop();
        }
        return res;
    }
}
