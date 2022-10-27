package Mang_Va_Doi_Tuong.Danh_sach_thuc_tap1;

public class Sinh_vien {
    private String id,name,lop,email,cty,tt;
    private static int count=0;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Sinh_vien(String id, String name, String lop, String email, String cty) {
        this.tt = ++count+"";
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.cty = cty;
    }

    public String getCty() {
        return cty;
    }

    @Override
    public String toString() {
        return tt+" "+id+" "+name+" "+lop+" "+email+" "+cty;
    }
}
