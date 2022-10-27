package Xau_Ki_Tu;

import java.util.Scanner;

public class Xau_con_Lon_nhat {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int index=0;
        for(char i='z';i>='a';i--){
            for(int j=index;j<s.length();j++){
                if(s.charAt(j)==i){
                    System.out.printf(String.valueOf(s.charAt(j)));
                    index=j;
                }
            }
        }
    }
}
