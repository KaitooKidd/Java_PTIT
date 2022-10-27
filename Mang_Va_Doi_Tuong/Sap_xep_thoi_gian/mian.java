package Mang_Va_Doi_Tuong.Sap_xep_thoi_gian;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] T = new Time[n];
        for(int i = 0; i < n; i++) {
            T[i] = new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(T, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.getHour() != o2.getHour())
                    return o1.getHour() - o2.getHour();
                else if(o1.getMinute() != o2.getMinute())
                    return o1.getMinute() - o2.getMinute();
                return o1.getSecond()-o2.getSecond();
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(T[i]);
        }
    }
}
