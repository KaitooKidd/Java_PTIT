package File.Xep_loai;

public class Sinh_vien {
    private String id,name,xep_loai;
    private double trung_binh;
    private static int count=0;
    public Sinh_vien(String name, int d1, int d2, int d3) {
        count++;
        this.id =String.format("SV%02d",count);
        this.name = chuan_hoa(name);
        this.trung_binh = Math.round((d1 * 0.25 + d2 * 0.35 + d3 * 0.4)*100.0)/100.0;

        if(this.trung_binh >= 8) this.xep_loai = "GIOI";
        else if(this.trung_binh >= 6.5) this.xep_loai = "KHA";
        else if(this.trung_binh >= 5) this.xep_loai = "TRUNG BINH";
        else this.xep_loai = "KEM";
    }
    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.2f",trung_binh)+" "+xep_loai;
    }

    public double getTrung_binh() {
        return trung_binh;
    }

    public String chuan_hoa(String s) {
        StringBuilder sb = new StringBuilder();
        String[]a = s.trim().toLowerCase().split("\\s+");
        for(int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
            sb.append(a[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
