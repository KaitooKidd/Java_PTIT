package Ung_dung_JAVA_Collection;

import java.util.Scanner;
import java.util.Stack;

public class Dau_tu_chung_khoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            b[0] = 1;
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for(int i = 1; i < n; i++) {
                while (!st.empty() && a[st.peek()] <= a[i]) st.pop();
                if(st.empty()) b[i] = i+1;
                else b[i] = i-st.peek();
                st.push(i);
            }
            for(int x : b) System.out.print(x+" ");
            System.out.println();
        }
    }
}
