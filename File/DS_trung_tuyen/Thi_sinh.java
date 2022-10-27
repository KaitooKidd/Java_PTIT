package File.DS_trung_tuyen;

public class Thi_sinh {
    private String id,name;
    private double d1,d2,d3,uu_tien,sum;

    public Thi_sinh(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        StringBuilder sb = new StringBuilder();
        String[]a = name.trim().toLowerCase().split("\\s+");
        for(int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
            sb.append(a[i].substring(1)).append(" ");
        }
        this.name = sb.toString().trim();
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;

        if(this.id.charAt(2) == '1') this.uu_tien = 0.5;
        else if(this.id.charAt(2) == '2') this.uu_tien = 1;
        else this.uu_tien = 2.5;

        this.sum = d1*2+d2+d3+this.uu_tien;
    }

    public String getId() {
        return id;
    }

    public double getSum() {
        return sum;
    }

    public void tooString() {
        System.out.print(id+" "+name+" ");
        int t = (int) (this.uu_tien*10);
        if(t%10 == 0) System.out.print((int)uu_tien+" ");
        else System.out.print(uu_tien+" ");

        t = (int) (this.sum*10);
        if(t%10 == 0) System.out.print((int)sum+" ");
        else System.out.print(sum+" ");
    }

}
