package File.Loai_phong;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String id, name;
    private int don_gia;
    private float phi_pv;

    @Override
    public String toString() {
        return id+" "+name+" "+don_gia+" "+phi_pv;
    }

    public LoaiPhong(String s) {
        String[] a = s.split("\\s+");
        this.id = a[0];
        this.name = a[1];
        this.don_gia = Integer.parseInt(a[2]);
        this.phi_pv = Float.parseFloat(a[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }
}
