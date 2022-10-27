package Lop_va_Doi_tuong.Danh_sach_mon_thi;

public class Mon_thi {
    private String ma,name,hinh_thuc;

    public Mon_thi(String ma, String name, String hinh_thuc) {
        this.ma = ma;
        this.name = name;
        this.hinh_thuc = hinh_thuc;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.name+" "+this.hinh_thuc;
    }
}
