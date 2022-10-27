package MANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Khoang_cach_nho_hon_K {
    static int LowerBound(ArrayList<Integer> a, int l, int r, int x) {
        int m = -1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if(a.get(mid) >= x) r = mid-1;
            else {
                m = mid;
                l = mid+1;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n= scan.nextInt();
            int k= scan.nextInt();
            ArrayList<Integer> M=new ArrayList<>();
            for(int i=0;i<n;i++){
                int o=scan.nextInt();M.add(o);
            }
            Collections.sort(M);
            long count=0;
            for(int i=0;i<n;i++){
                int x=LowerBound(M,i+1,n-1,M.get(i)+k);
                if(x>0)
                    count+=x-i;
            }
            System.out.println(count);
        }
    }
}
