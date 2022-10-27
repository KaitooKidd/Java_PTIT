package Mang_Va_Doi_Tuong.Bang_diem_Hoc_sinh;

public class Hoc_Sinh {
    private String id,name,rank;
    private static int count=0;
    private double tb;

    public String getId() {
        return id;
    }

    public Hoc_Sinh(String name, String[] diemTP ) {
        count++;
        if(count<10) this.id = "HS0"+count;
        else this.id = "HS"+count;
        this.name = name;
        for(int i = 0;i < 10 ;i++)
            tb += Double.parseDouble(diemTP[i]);
        tb += Double.parseDouble(diemTP[0]) + Double.parseDouble(diemTP[1]);
        tb /= 12;
        tb = Math.round(tb * 10.0) / 10.0;
        if(tb >= 9) this.rank = "XUAT SAC";
        else if(tb >= 8 && tb < 9) this.rank = "GIOI";
        else if(tb >= 7 && tb < 8) this.rank = "KHA";
        else if(tb >= 5 && tb < 7) this.rank = "TB";
        else this.rank = "YEU";
    }

    public double getTb() {
        return tb;
    }

    public String toString() {
        return id+" "+name+" "+String.format("%.1f",tb)+" "+rank;
    }
}
