package File.Tinh_diem_trung_binh;

public class Ptit {
    private String id,name;
    private double trung_binh;
    private static int count=0;

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.2f",trung_binh)+" ";
    }

    public Ptit(String name, int d1, int d2, int d3) {
        count++;
        this.id =String.format("SV%02d",count);
        this.name = chuan_hoa(name);
        this.trung_binh = Math.round(((d1*3+d2*3+d3*2)*1.0/8)*100.0)/100.0;
    }

    public String getId() {
        return id;
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
