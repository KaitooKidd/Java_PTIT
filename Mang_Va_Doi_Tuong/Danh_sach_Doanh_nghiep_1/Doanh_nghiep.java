package Mang_Va_Doi_Tuong.Danh_sach_Doanh_nghiep_1;

public class Doanh_nghiep {
    private String id,name;
    private int count;

    public String getId() {
        return id;
    }

    public Doanh_nghiep(String id, String name, int count) {
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
