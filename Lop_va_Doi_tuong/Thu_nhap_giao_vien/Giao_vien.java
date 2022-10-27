package Lop_va_Doi_tuong.Thu_nhap_giao_vien;

public class Giao_vien {
    private String id,name;
    private long luong,bacluong, phucap,thunhap;

    public Giao_vien(String id, String name, long luong) {
        this.id = id;
        this.name = name;
        this.luong = luong;
    }
    public String toString() {
        if(this.id.startsWith("HT")) this.phucap = 2000000;
        else if(this.id.startsWith("HP")) this.phucap = 900000;
        else this.phucap = 500000;
        this.bacluong = (this.id.charAt(2)-48)*10 + this.id.charAt(3)-48;
        return this.id+" "+this.name+" "+this.bacluong+" "+this.phucap+" "+(this.luong*this.bacluong+this.phucap);
    }

}
