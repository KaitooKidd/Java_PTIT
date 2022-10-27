package File.Chuan_hoa_va_sap_xep;

public class Person implements Comparable<Person>{
    private String name, ho, ten_dem;

    public Person(String s) {
        String[] a = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(a[0].charAt(0)));
        sb.append(a[0].substring(1)).append(" ");
        ho = sb.toString().trim();

        sb = new StringBuilder();
        for (int i = 1; i < a.length - 1; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
            sb.append(a[i].substring(1)).append(" ");
        }
        ten_dem = sb.toString().trim();

        sb = new StringBuilder();
        sb.append(Character.toUpperCase(a[a.length-1].charAt(0)));
        sb.append(a[a.length-1].substring(1)).append(" ");
        name = sb.toString().trim();
    }

    @Override
    public String toString() {
        return ho+" "+ten_dem+" "+name;
    }

    @Override
    public int compareTo(Person o) {
        if(this.name.compareTo(o.name) > 0)
            return 1;
        if(this.name.compareTo(o.name)==0) {
            if(this.ho.compareTo(o.ho) > 0)
                return 1;
            if(this.ho.compareTo(o.ho)==0)
                return this.ten_dem.compareTo(o.ten_dem);
        }
        return -1;
    }
}
