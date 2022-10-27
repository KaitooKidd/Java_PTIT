package File.Ten_viet_tat;

public class Person implements Comparable<Person>{
    private String name,viet_tat,ten,ho;

    public String getViet_tat() {
        return viet_tat;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Person(String s) {
        this.name = s;
        String[] a = s.trim().split("\\s+");
        this.viet_tat="";
        for(int i = 0; i < a.length; i++) {
            if(i == a.length-1) this.viet_tat+=a[i].charAt(0);
            else this.viet_tat += a[i].charAt(0)+".";
        }

        ho = a[0];

        ten = a[a.length-1];
    }

    @Override
    public int compareTo(Person o) {
        if(this.ten.compareTo(o.ten) > 0)
            return 1;
        if(this.ten.compareTo(o.ten) == 0)
            return this.ho.compareTo(o.ho);
        return -1;
    }
}
