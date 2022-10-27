package Mang_Va_Doi_Tuong.Sap_xep_DS_GV;

public class Giang_Vien {
    private String fullname,nganh,name,id;
    private static int count = 0;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Giang_Vien(String fullname, String nganh) {
        count++;
        if(count >= 10)this.id = "GV"+count;
        else this.id = "GV0" + count;
        this.fullname = fullname;
        this.nganh = nganh.toUpperCase();
        String arr[] = fullname.split("\\s");
        this.name = arr[arr.length-1];
        String brr[] = this.nganh.split("\\s");
        this.nganh="";
        for(int i = 0; i < brr.length; i++) {
            this.nganh+=brr[i].charAt(0);
        }
    }
    public String toString() {
        return id+" "+fullname+" "+nganh;
    }
}
