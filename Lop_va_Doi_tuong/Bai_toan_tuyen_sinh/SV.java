package Lop_va_Doi_tuong.Bai_toan_tuyen_sinh;

public class SV {
    private String id,name,trang_thai;
    double d1,d2,d3,uu_tien,sum;

    public SV(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public void tooString() {
        System.out.print(id+" "+name+" ");
        if(this.id.charAt(2) == '1') this.uu_tien = 0.5;
        else if(this.id.charAt(2) == '2') this.uu_tien = 1;
        else this.uu_tien = 2.5;
        int t = (int) (this.uu_tien*10);
        if(t%10 == 0) System.out.print((int)uu_tien+" ");
        else System.out.print(uu_tien+" ");
        this.sum = d1*2+d2+d3;
         t = (int) (this.sum*10);
        if(t%10 == 0) System.out.print((int)sum+" ");
        else System.out.print(sum+" ");
        double S = this.sum + this.uu_tien;
        if(S >= 24) System.out.print("TRUNG TUYEN");
        else System.out.print("TRUOT");
    }
}
