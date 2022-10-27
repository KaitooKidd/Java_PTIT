package Ung_dung_JAVA_Collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Phan_tu_ben_phai_dau_tien_lon_hon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++) {
                if(st.empty()) st.push(i);
                else {
                    while (!st.empty() && a[st.peek()] < a[i]) {
                        b[st.pop()] = a[i];
                    }
                    st.push(i);
                }
            }
            while (!st.empty()) {
                b[st.pop()] = -1;
            }
            for(int x : b) System.out.print(x+" ");
            System.out.println();
        }
    }
}
