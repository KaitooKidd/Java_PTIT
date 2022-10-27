package Mang_Va_Doi_Tuong.Tinh_gia_ban_1;

public class Mat_Hang {
    private String name,dvi_tinh,id;
    private long nhap,so_luong,deli,deli1,thanh_tien,thanh_tien1,gia_ban;
    private static int count=0;

    public long getGia_ban() {
        return gia_ban;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+dvi_tinh+" "+deli+" "+thanh_tien+" "+gia_ban;
    }

    public Mat_Hang(String name, String dvi_tinh, long nhap, long so_luong) {
        count++;
        if(count<10) this.id="MH0"+count;
        else this.id = "MH"+count;
        this.name = name;
        this.dvi_tinh = dvi_tinh;
        this.nhap = nhap;
        this.so_luong = so_luong;
        this.deli = Math.round(nhap*so_luong*5*1.0/100);
        this.deli1 = Math.round(nhap*5*1.0/100);
        this.thanh_tien = nhap*so_luong+deli;
        this.thanh_tien1 = nhap+deli1;
        //this.gia_ban = Math.round(this.thanh_tien*102*1.0/100);
        this.gia_ban =this.thanh_tien1*102/100;
        if (this.gia_ban % 100 != 0) {
            this.gia_ban = ((this.gia_ban / 100) + 1) * 100;
        }
    }
}
