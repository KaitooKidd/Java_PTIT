package Mang_Va_Doi_Tuong.Tim_Thu_Khoa_Ki_Thi;


import java.util.Date;

public class Sinh_vien implements Comparable<Sinh_vien>{
    private String name,DateOfBirth,id;
    private float d1,d2,d3,sum;
    private static int count = 0;

    public Sinh_vien(String name, String dateOfBirth, float d1, float d2, float d3) {
        count++;
        this.id = count+"";
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.sum = d1+d2+d3;
    }

    public float getSum() {
        return sum;
    }

    public int compareTo(Sinh_vien o) {
        if (this.getSum() > o.getSum()) {
            return 1;
        } else if (this.getSum() < o.getSum()) {
            return -1;
        }
        return 0;
    }

    public String toString() {
        return id+" "+name+" "+ DateOfBirth+" "+String.format("%.1f",sum);
    }
}
