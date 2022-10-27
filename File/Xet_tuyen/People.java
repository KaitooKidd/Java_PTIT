package File.Xet_tuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class People {
    private String name,id,xep_loai;
    private Date ngay_sinh;
    private double d1,d2,diem_thuong, sum;
    private long tuoi;
    private static int count = 0;
    public People(String name, String ns, double d1, double d2) throws ParseException {
        count++;
        this.id = String.format("PH%02d",count);
        this.name = chuan_hoa(name);

        this.ngay_sinh = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.tuoi = (new Date().getYear() - this.ngay_sinh.getYear())-1;

        this.d1 = d1;
        this.d2 = d2;
        if(d1 >= 8 && d2 >= 8) this.diem_thuong = 1;
        else if(d1 >= 7.5 && d2 >= 7.5) this.diem_thuong = 0.5;
        else this.diem_thuong = 0;
        this.sum = (d1+d2)/2 + this.diem_thuong;
        if(this.sum > 10) this.sum = 10;
        this.sum = Math.round(sum);

        if(sum < 5) this.xep_loai = "Truot";
        else if(sum <= 6) this.xep_loai = "Trung binh";
        else if(sum<=7) this.xep_loai = "Kha";
        else if(sum <= 8) this.xep_loai = "Gioi";
        else this.xep_loai = "Xuat sac";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+tuoi+" "+ Math.round(sum)+" "+xep_loai;
    }

    public String chuan_hoa(String s) {
        StringBuilder sb = new StringBuilder();
        String[]a = s.trim().toLowerCase().split("\\s+");
        for(int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
            sb.append(a[i].substring(1)).append(" ");
        }
      return sb.toString().trim();
    }

}
