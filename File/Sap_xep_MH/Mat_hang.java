package File.Sap_xep_MH;
public class Mat_hang implements Comparable<Mat_hang> {
    private String id,name,group;
    private double mua,ban,loinhuan;
    private static int count=0;

    public Mat_hang(String name, String group, double mua, double ban) {
        count++;
        if(count<10) this.id = "MH0"+count;
        else this.id = "MH"+count;
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
    public int compareTo(Mat_hang o) {
        return (int)(o.loinhuan-this.loinhuan);
    }
}
