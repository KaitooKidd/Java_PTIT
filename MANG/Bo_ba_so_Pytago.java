package MANG;
import java.util.*;
public class Bo_ba_so_Pytago {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int t=scan.nextInt();
            while(t-->0){
                int n= scan.nextInt();
                long[] M=new long[n];
                Set<Long> X=new HashSet<>();
                for(int i=0;i<n;i++){
                    M[i]=scan.nextLong();
                    M[i]=M[i]*M[i];
                    X.add(M[i]);
                }
                Arrays.sort(M);
                System.out.println(Ktra(M,n,X));
            }
        }
        public static String Ktra(long[] M,int n,Set<Long> X){
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(X.contains((M[i]+M[j]))==true)
                        return "YES";
                }
            }
            return "NO";
        }
    }
