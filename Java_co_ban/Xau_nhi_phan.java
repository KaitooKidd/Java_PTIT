import java.util.Scanner;

public class Xau_nhi_phan {
    public static long[] X = new long[94];
    public static char solve(long n, long k) {
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k > X[(int) (n-2)]) return solve(n-1,k-X[(int)(n-2)]);
        return solve(n-2,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X[1] = 1;
        X[2] = 1;
        for(int i = 3; i <= 93; i++)
        {
            X[i] = X[i-1] + X[i-2];
        }
        int t = sc.nextInt();
        while(t>0){
            t--;
            long n = sc.nextLong(), k = sc.nextLong();
            System.out.println(Xau_nhi_phan.solve(n,k));
        }
    }
}
