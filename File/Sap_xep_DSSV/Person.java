package File.Sap_xep_DSSV;

public class Person implements Comparable<Person> {
    private String id,ten,name, ho, ten_dem,sdt,email;

    public Person(String id,String ten,String sdt, String email) {
        this.id = id;
        this.sdt = sdt;
        this.email = email;
        this.ten = ten;
        String[] a = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(a[0].charAt(0)));
        sb.append(a[0].substring(1)).append(" ");
        this.ho = sb.toString().trim();

        sb = new StringBuilder();
        for (int i = 1; i < a.length - 1; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
            sb.append(a[i].substring(1)).append(" ");
        }
        this.ten_dem = sb.toString().trim();

        sb = new StringBuilder();
        sb.append(Character.toUpperCase(a[a.length-1].charAt(0)));
        sb.append(a[a.length-1].substring(1)).append(" ");
        this.name = sb.toString().trim();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+sdt+" "+email;
    }

    @Override
    public int compareTo(Person o) {
        if(this.name.compareTo(o.name) > 0)
            return 1;
        if(this.name.compareTo(o.name)==0) {
            if(this.ho.compareTo(o.ho) > 0)
                return 1;
            if(this.ho.compareTo(o.ho)==0) {
                if (this.ten_dem.compareTo(o.ten_dem) > 0)
                    return 1;
                if(this.ten_dem.compareTo(o.ten_dem)==0)
                    return this.id.compareTo(o.getId());
            }
        }
        return -1;
    }
}
