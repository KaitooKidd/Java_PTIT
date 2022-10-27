package Mang_Va_Doi_Tuong.Danh_sach_doi_tuong_NV;

import java.util.Date;

public class Nhan_Vien {
    private String id,name,sex,DateOfBirth,address,ma,ngay_ky;
    private static int count = 0;
    public Nhan_Vien(String name, String sex, String dateOfBirth, String address, String ma, String ngay_ky) {
        count++;
        if(count < 10)this.id = "0000"+count;
        else this.id = "000"+count;
        this.name = name;
        this.sex = sex;
        DateOfBirth = dateOfBirth;
        this.address = address;
        this.ma = ma;
        this.ngay_ky = ngay_ky;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+sex+" "+ DateOfBirth+" "+address+" "+ma+" "+ngay_ky;
    }

    public String getNgaySinh() {
        return DateOfBirth;
    }
}
