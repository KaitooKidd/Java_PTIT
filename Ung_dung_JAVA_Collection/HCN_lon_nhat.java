package Ung_dung_JAVA_Collection;

import java.util.Scanner;
import java.util.Stack;

public class HCN_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            Stack<Integer> st = new Stack<>();
            long maxx = 0;
            int i = 0;
            while (i<n)
            {
                if(st.empty() || a[st.peek()] <= a[i])
                {
                    st.push(i);
                    i++;
                }
                else
                {
                    int index = st.pop();
                    if(st.empty()) maxx = Math.max(maxx,a[index]*i);
                    else maxx = Math.max(maxx,(a[index]*(i-st.peek()-1)));
                }
            }
            while (!st.empty()) {
                int index = st.pop();
                if(st.empty()) maxx = Math.max(maxx,a[index]*i);
                else maxx = Math.max(maxx,(a[index]*(i-st.peek()-1)));
            }
            System.out.println(maxx);
        }
    }
}
