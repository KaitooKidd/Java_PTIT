package Java_co_ban;

import java.util.Scanner;

public class Hinh_vuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int max1 = Math.max(Math.max(a,c),Math.max(e,g));
        int min1 = Math.min(Math.min(a,c),Math.min(e,g));
        int max2 = Math.max(Math.max(b,d),Math.max(f,h));
        int min2 = Math.min(Math.min(b,d),Math.min(f,h));
        if((max1 - min1) > (max2-min2)) System.out.println((max1-min1)*(max1-min1));
        else System.out.println((max2-min2)*(max2-min2));
    }
}