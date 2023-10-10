package Test;

import java.util.Scanner;
import java.util.Stack;

public class bai_1 {
     public static String solution(String s) {
         Stack<Character> st = new Stack<>();
         for(int i = 0; i < s.length(); i++) {
             if(s.charAt(i) != '#') {
                 st.push(s.charAt(i));
             }
             else if (!st.empty()) {
                 st.pop();
             }
         }
         StringBuilder ss = new StringBuilder();
         while (!st.empty()) {
             ss.append(st.pop());
         }
        return ss.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0) {
            int a = 5;
            int b = a;
            b = 4;
            System.out.println(a);
            String s = sc.nextLine();
            System.out.println(solution(s));
            t--;
        }
    }
}
