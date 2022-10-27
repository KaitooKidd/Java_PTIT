package File.DSSV;

public class Sinh_vien implements Comparable<Sinh_vien>{
    private String id,name,lop,email;

    public Sinh_vien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = chuan_hoa(name);
        this.lop = lop;
        this.email = email;
    }


    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+email;
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


    @Override
    public int compareTo(Sinh_vien o) {
        return this.id.compareTo(o.id);
    }
}
