package Mang_Va_Doi_Tuong.Sap_xep_SV_theo_lop_ma;

public class Sinh_Vienn {
    private String id,name,lop,email;

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    public Sinh_Vienn(String id, String name, String lop, String email) {
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
