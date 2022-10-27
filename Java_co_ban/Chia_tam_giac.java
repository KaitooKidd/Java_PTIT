import java.util.Scanner;
import java.lang.Math;
public class Chia_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0)
        {
            int n = sc.nextInt(), h = sc.nextInt();
            for(int i = 1; i < n; i++)
            {
                System.out.printf("%.6f",h*Math.sqrt((double)i/n));
                System.out.print(" ");
            }
            System.out.print("\n");
            a--;
        }
    }
}
