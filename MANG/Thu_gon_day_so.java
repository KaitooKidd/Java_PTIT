package MANG;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Thu_gon_day_so {
    public static int xuli(int a[], int n) {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++) {
            if(s.empty() || (a[i] + s.peek()) % 2 != 0)
                s.push(a[i]);
            else s.pop();
        }
        return s.size();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print(xuli(a,n));
    }
}
