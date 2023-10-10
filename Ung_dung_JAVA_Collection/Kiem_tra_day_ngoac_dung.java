package Ung_dung_JAVA_Collection;

import java.util.Scanner;
import java.util.Stack;

public class Kiem_tra_day_ngoac_dung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine();
            int x =  2147483647+15;
            System.out.println(x);
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));
            else if(!st.empty()){
                if(s.charAt(i) == ')' && st.peek() != '(')
                    return false;
                if(s.charAt(i) == ']' && st.peek() != '[')
                    return false;
                if (s.charAt(i) == '}' && st.peek() != '{')
                    return false;
                st.pop();
            }
        }
        return st.empty();
    }
}
