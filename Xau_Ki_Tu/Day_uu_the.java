package Xau_Ki_Tu;

import java.util.Scanner;

public class Day_uu_the {
    public static String Ktra(String[] M){
        int a=0,b=0;
        for(int i=0;i<M.length;i++){
            if(Integer.parseInt(M[i])%2==0)a++;
            else b++;
        }
        if((a+b)%2==0&&a>b||(a+b)%2==1&&b>a)return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= Integer.parseInt(scan.nextLine());
        while(t-->0){
            String s=scan.nextLine();
            String[] S=s.split(" ");
            System.out.println(Ktra(S));
        }
    }
}
