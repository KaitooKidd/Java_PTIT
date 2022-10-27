package Java_co_ban;

import java.util.Scanner;

    public class Bsc_Usc {
        public static long USCLN(long a, long b) {
            if (b == 0) return a;
            return USCLN(b, a % b);
        }
        public static long BSCNN(long a, long b) {
            return (a * b) / USCLN(a, b);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                long a = sc.nextLong();
                long b = sc.nextLong();
                System.out.print(BSCNN(a,b) + " " + USCLN(a,b) +"\n");
                t--;
            }
    }
}
