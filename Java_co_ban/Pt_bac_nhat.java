import  java.util.Scanner;
public class Pt_bac_nhat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if(a == 0)
        {
            if(b != 0) System.out.print("VN");
            else System.out.print("VSN");
        }
        else
        {
            if(b != 0) System.out.printf("%.2f",-b/a);
            else System.out.print(0);
        }
    }
}