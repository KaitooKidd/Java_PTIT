package Mang_Va_Doi_Tuong.Tim_kiem_GV;

public class GV {
    private String fullname,nganh,id;
    private static int count = 0;

    public String getFullName() {
        return fullname;
    }

    public String getId() {
        return id;
    }

    public GV(String fullname, String nganh) {
        count++;
        if(count >= 10)this.id = "GV"+count;
        else this.id = "GV0" + count;
        this.fullname = fullname;
        String brr[] = nganh.toUpperCase().split("\\s");
        nganh="";
        for(int i = 0; i < brr.length; i++) {
            nganh+=brr[i].charAt(0);
        }
        this.nganh = nganh;
    }
    public String toString() {
        return id+" "+fullname+" "+nganh;
    }
}
