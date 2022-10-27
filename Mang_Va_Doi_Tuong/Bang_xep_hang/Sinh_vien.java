package Mang_Va_Doi_Tuong.Bang_xep_hang;

public class Sinh_vien implements Comparable<Sinh_vien>{
    private String name;
    private int C,T;

    public String getName() {
        return name;
    }

    public int getC() {
        return C;
    }

    public int getT() {
        return T;
    }

    @Override
    public String toString() {
        return name+" "+C+" "+T;
    }

    public Sinh_vien(String name, String s) {
        this.name = name;
        String a[] = s.split("\\s");
        this.C = Integer.parseInt(a[0]);
        this.T = Integer.parseInt(a[1]);
    }
    @Override
    public int compareTo(Sinh_vien o) {
       if(this.C > o.getC())
           return -1;
       else if(this.C == o.getC()) {
           if(this.T < o.getT())
               return -1;
           else if(this.T == o.getT())
               return this.name.compareTo(o.getName());
       }
       return 1;
    }

}
