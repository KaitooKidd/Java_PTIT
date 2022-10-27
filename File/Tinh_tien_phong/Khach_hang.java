package File.Tinh_tien_phong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Khach_hang implements Comparable<Khach_hang>{
    private String id,name,so_phong;
    private long dich_vu,ngay_o,thanh_tien;
    private static int count = 0;
    private Date nhan,tra;


    public Khach_hang(String name, String so_phong, String ngay_nhan, String ngay_den, long dich_vu) throws ParseException {
        count++;
        this.id = String.format("KH%02d",count);

        StringBuilder sb = new StringBuilder();
        String[]a = name.trim().toLowerCase().split("\\s+");
        for(int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
           sb.append(a[i].substring(1)).append(" ");
        }
        this.name = sb.toString().trim();

        this.so_phong = so_phong;
        this.dich_vu = dich_vu;
        this.nhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngay_nhan);
        this.tra = new SimpleDateFormat("dd/MM/yyyy").parse(ngay_den);
        this.ngay_o = (tra.getTime()-nhan.getTime())/(24*3600*1000)+1;

        if(so_phong.charAt(0)=='1') this.thanh_tien = this.ngay_o*25+this.dich_vu;
        else if(so_phong.charAt(0)=='2') this.thanh_tien = this.ngay_o*34+this.dich_vu;
        else if(so_phong.charAt(0)=='3') this.thanh_tien = this.ngay_o*50+this.dich_vu;
        else this.thanh_tien = this.ngay_o*80+this.dich_vu;
    }

    @Override
    public int compareTo(Khach_hang o) {
        if(this.thanh_tien > o.thanh_tien)
            return -1;
        return 1;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+so_phong+" "+ngay_o+" "+thanh_tien;
    }
}
