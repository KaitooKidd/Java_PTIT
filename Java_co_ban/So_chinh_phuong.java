import java.util.Scanner;

public class So_chinh_phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0)
        {
            t--;
            int n = sc.nextInt();
            int a = (int) Math.sqrt(n);
            if(a*a == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
