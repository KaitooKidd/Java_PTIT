package Ung_dung_JAVA_Collection;

import java.util.Scanner;
import java.util.Stack;

public class HCN_don_sac {
    public static long solve(long[] a,int n) {
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
        return maxx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = m-a[i];
        }
        System.out.println(Math.max(solve(a,n),solve(b,n)));
    }
}
