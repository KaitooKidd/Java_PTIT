package MANG;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            Map<Integer, Integer> m = new HashMap<>();
            int x;
            int[] a = new int[n];
            for(int j = 0; j < n; j++)
            {
                x = sc.nextInt();
                a[j] = x;
                m.put(x, m.getOrDefault(x,0) + 1);
            }
            System.out.println("Testt " +i +":");
            for(int j=0;j<n;j++)    {
                  if(m.get(a[j]) !=0){
                    System.out.println(a[j]+" xuat hien "+m.get(a[j])+" lan");
                    m.put(a[j],0);
               }
            }
        }
    }
}
