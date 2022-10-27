package Lop_va_Doi_tuong.Bai_toan_tinh_cong;

import java.util.Objects;

public class Nhan_Vienn {
    private String id,name,chuc_vu;
    private long luong,ngay_cong,thuong,phu_cap,thu_nhap;

    public Nhan_Vienn(String name, long luong, long ngay_cong, String chuc_vu) {
        this.name = name;
        this.chuc_vu = chuc_vu;
        this.luong = luong;
        this.ngay_cong = ngay_cong;
    }

    @Override
    public String toString() {
        this.id = "NV01";
        this.luong *= this.ngay_cong;
        if(this.ngay_cong>=25) this.thuong = this.luong*20/100;
        else if(this.ngay_cong >= 22 && this.ngay_cong < 25) this.thuong = this.luong*10/100;
        else this.thuong = 0;
        if(Objects.equals(this.chuc_vu, "GD")) this.phu_cap = 250000;
        else if(Objects.equals(this.chuc_vu, "PGD")) this.phu_cap = 200000;
        else if(Objects.equals(this.chuc_vu, "TP")) this.phu_cap = 180000;
        else this.phu_cap = 150000;
        this.thu_nhap = this.luong + this.thuong + this.phu_cap;
        return id+" "+name+" "+luong+" "+thuong+" "+phu_cap+" "+thu_nhap;
    }
}
