import java.util.Scanner;
public class Cat_doi {
    public static String cat_doii(String s) {
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='0' || s.charAt(i)=='1') continue;
            else if(s.charAt(i)=='8' || s.charAt(i)=='9') {
                s=s.replace('8', '0');
                s=s.replace('9', '0');
            }
            else return "INVALID";
        }
        String s1="";
        int f=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!='0' || f==1) {
                s1+=s.charAt(i);
                f=1;
            }
        }
        if(s1=="") return "INVALID";
        else return s1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            t--;
            String s=sc.next();
            System.out.println(cat_doii(s));
        }
    }
}