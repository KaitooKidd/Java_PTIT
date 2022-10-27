package File.Diem_tuyen_sinh;

import java.util.Objects;

public class Thi_sinh {
    private String id,name,dan_toc,trang_thai;
    private static int count = 0;
    private double diem_thi,uu_tien;

    public String getId() {
        return id;
    }

    public double getDiem_thi() {
        return diem_thi;
    }

    public Thi_sinh(String name, double diem_thi, String dan_toc, int khu_vuc) {
        count++;
        this.id = String.format("TS%02d",count);
        this.name = chuan_hoa(name);
        this.dan_toc = dan_toc;

        if(khu_vuc == 1) {
            this.uu_tien = 1.5;
        }
        else if(khu_vuc == 2) this.uu_tien = 1;
        else this.uu_tien = 0;

        if(Objects.equals(dan_toc, "Kinh")) this.uu_tien += 0;
        else this.uu_tien += 1.5;

        this.diem_thi = diem_thi + this.uu_tien;
        if(this.diem_thi >= 20.5) this.trang_thai = "Do";
        else this.trang_thai = "Truot";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.1f",diem_thi)+" "+trang_thai;
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
