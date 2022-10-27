package Mang_Va_Doi_Tuong.Liet_ke_SV_theo_lop;

public class SV {
    private String id,name,lop,email;

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    public SV(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+email;
    }
}
