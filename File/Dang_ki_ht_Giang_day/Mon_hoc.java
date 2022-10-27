package File.Dang_ki_ht_Giang_day;

public class Mon_hoc {
    private String id,name,li_thuyet,thuc_hanh;
    private int tin_chi;

    public String getThuc_hanh() {
        return thuc_hanh;
    }

    public Mon_hoc(String id, String name, int tin_chi, String li_thuyet, String thuc_hanh) {
        this.id = id;
        this.name = name;
        this.li_thuyet = li_thuyet;
        this.thuc_hanh = thuc_hanh;
        this.tin_chi = tin_chi;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+tin_chi+" "+li_thuyet+" "+thuc_hanh;
    }
}
