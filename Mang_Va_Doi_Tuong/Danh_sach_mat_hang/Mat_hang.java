package Mang_Va_Doi_Tuong.Danh_sach_mat_hang;

public class Mat_hang {
    private String id,name,don_vi;
    private long mua,ban;
    static int count = 0;

    public Mat_hang(String name, String don_vi, long mua, long ban) {
        count++;
        if(count < 10)this.id = "MH00" + count;
        else this.id = "MH0" + count;
        this.name = name;
        this.don_vi = don_vi;
        this.mua = mua;
        this.ban = ban;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDon_vi() {
        return don_vi;
    }


    public long getMua() {
        return mua;
    }

    public long getBan() {
        return ban;
    }
    public long getLoi_nhuan() {
        return ban-mua;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+don_vi+" "+mua+" "+ban+" "+getLoi_nhuan();
    }
}

