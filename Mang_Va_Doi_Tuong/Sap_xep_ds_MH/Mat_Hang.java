package Mang_Va_Doi_Tuong.Sap_xep_ds_MH;

public class Mat_Hang implements Comparable<Mat_Hang>{
    private int id;
    private String name,group;
    private double mua,ban,loinhuan;
    private static int count=1;

    public Mat_Hang(String name, String group, double mua, double ban) {
        this.id = count++;
        this.name = name;
        this.group = group;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = ban-mua;
    }
    public String toString() {
        return id+" "+name+" "+group+" "+String.format("%.2f",loinhuan);
    }

    @Override
    public int compareTo(Mat_Hang o) {
        return (int)(o.loinhuan-this.loinhuan);
    }
}
