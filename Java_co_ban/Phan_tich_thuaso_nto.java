import java.util.Scanner;

public class Phan_tich_thuaso_nto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            System.out.print("Testt " + i +": ");
            for(int j = 2; j <= Math.sqrt(n); j++)
            {
                int dem = 0;
                while (n % j == 0)
                {
                    dem++;
                    n /= j;
                }
                if(dem > 0) System.out.print(j + "(" + dem + ")" + " ");
            }
            if(n > 1) System.out.print(n + "(1)");
            System.out.println();
        }
    }
}
