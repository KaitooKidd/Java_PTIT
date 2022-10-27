package Xau_Ki_Tu;

import java.util.Scanner;
import java.util.Stack;

public class Rut_gon_xau_ki_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < a.length(); i++) {
            if(st.empty() || a.charAt(i) != st.peek()) {
                st.push(a.charAt(i));
            }
            else st.pop();
        }
        if(st.empty()) System.out.println("Empty String");
        else {
            StringBuilder sb = new StringBuilder();
            while (!st.empty()) {
                sb.append(st.pop());
            }
            System.out.println(sb.reverse());
        }
    }
}
