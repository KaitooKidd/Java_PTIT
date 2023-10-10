package Test;

import java.util.Locale;
import java.util.Scanner;

public class bai_2 {
    public  static int solution(int index) {
        if (index <= 1) return  1;
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        for (int i = 2; i <= index; i++) {
            fn = (f1%10+f2%10)%10;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            System.out.println(solution(n));
            t--;
        }
    }
}
