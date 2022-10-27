package MANG;

import java.util.Scanner;

public class Lua_chon_tham_lam {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        if(k==0||k>n*9){
            System.out.println("-1 -1");
        }
        else{
            String a="",b="";
            int x=k,y=k;
            x--;
            for(int i=n;i>1;i--) {
                if (x >= 9) {
                    a = "9" + a;
                    x -= 9;
                } else if (x != 0) {
                    a = x + a;
                    x = 0;
                } else a = "0" + a;
            }
            a = (x+1) + a;
            for(int i=n;i>=1;i--){
                if(y>=9){
                    b+="9";
                    y-=9;
                }
                else{
                    b+=y;
                    y=0;
                }
            }
            System.out.println(a+" "+b);
        }
    }
}