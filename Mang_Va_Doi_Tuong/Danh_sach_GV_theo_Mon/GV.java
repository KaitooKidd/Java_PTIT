package Mang_Va_Doi_Tuong.Danh_sach_GV_theo_Mon;

public class GV {
    private String name,nganh,id;
    static int count = 0;
    public GV(String name, String nganh) {
        count++;
        if(count<10) this.id = "GV0"+count;
        else this.id = "GV"+count;
        this.name = name;
        nganh = nganh.toUpperCase();
        String arr[] = nganh.split("\\s");
        this.nganh="";
        for(int i = 0; i < arr.length; i++) {
            this.nganh+=arr[i].charAt(0);
        }
    }

    @Override
    public String toString() {
        return id+" "+name+" "+nganh;
    }

    public String getNganh() {
        return nganh;
    }
}
