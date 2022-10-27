package Lop_va_Doi_tuong.Bang_ke_tien_luong;

import java.util.Objects;

public class Nhan_Vien {
    private String id,name,cv;
    private Long Luong_ngay,ngay_cong,phu_cap,luong,thuc_linh,thuong;
    private static int count = 0;

    public Long getThuc_linh() {
        return thuc_linh;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+luong+" "+thuong+" "+phu_cap+" "+thuc_linh;
    }

    public Nhan_Vien(String name, Long luong_ngay, Long ngay_cong, String cv) {
        count++;
        if(count < 10) this.id = "NV0"+count;
        else this.id = "NV"+count;
        this.name = name;
        this.cv = cv;
        Luong_ngay = luong_ngay;
        this.ngay_cong = ngay_cong;

        this.luong = ngay_cong*luong_ngay;

        if(ngay_cong >= 25) this.thuong = this.luong*20/100;
        else if(ngay_cong >= 22) this.thuong = this.luong*10/100;
        else this.thuong = (long)0;

        if(Objects.equals(cv, "GD")) this.phu_cap = (long)250000;
        else if(Objects.equals(cv,"PGD")) this.phu_cap = (long)200000;
        else if(Objects.equals(cv,"TP")) this.phu_cap = (long)180000;
        else this.phu_cap = (long)150000;

        this.thuc_linh = this.luong+this.thuong+this.phu_cap;
    }
}
