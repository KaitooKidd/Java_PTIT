import java.util.Scanner;

public class So_lien_ke {
    public static boolean check(String s){
        for(int i = 0; i < s.length()-1;i++)
        {
            if(Math.abs((s.charAt(i)-48) -(s.charAt(i+1)-48))!= 1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            t--;
            String s = sc.next();
            if(So_lien_ke.check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
