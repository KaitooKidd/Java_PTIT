package Java_co_ban;

import java.util.Scanner;
public class Tong_giai_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0, facto = 1;
        for(int i = 1; i <= n; i++)
        {
            facto *= i;
            sum += facto;
        }
        System.out.print(sum);
    }
}
