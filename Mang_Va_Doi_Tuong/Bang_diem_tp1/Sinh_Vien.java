package Mang_Va_Doi_Tuong.Bang_diem_tp1;

public class Sinh_Vien {
    private String id,name,lop;
    private float d1,d2,d3;

    public Sinh_Vien(String id, String name, String lop, float d1, float d2, float d3) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+String.format("%.1f",d1)+" "+String.format("%.1f",d2)+" "+String.format("%.1f",d3);
    }
}
