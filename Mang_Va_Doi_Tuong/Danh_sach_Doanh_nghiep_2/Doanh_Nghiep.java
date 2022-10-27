package Mang_Va_Doi_Tuong.Danh_sach_Doanh_nghiep_2;

public class Doanh_Nghiep {
    private String id,name;
    private int count;

    public String getId() {
        return id;
    }

    public Doanh_Nghiep(String id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+count;
    }

    public int getCount() {
        return count;
    }
}
