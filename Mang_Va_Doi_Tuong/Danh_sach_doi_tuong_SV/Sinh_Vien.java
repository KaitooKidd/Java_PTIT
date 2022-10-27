package Mang_Va_Doi_Tuong.Danh_sach_doi_tuong_SV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sinh_Vien {
    private String id;
    private String name;
    private Date DateOfBirth;

    public float getGpa() {
        return gpa;
    }

    private String lop;
    private float gpa;
    private static int count = 0;

    public Sinh_Vien(String name, String lop, String dateOfBirth, float gpa) throws ParseException {
        count++;
        if(count < 10) this.id = "B20DCCN00"+count;
        else this.id = "B20DCCN0"+count;
        this.name = name;
        this.DateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.lop = lop;
        this.gpa = gpa;
    }
    public String chuanhoa(String a) {
        a = a.trim();
        a = a.toLowerCase();
        while (a.contains("  ") == true) {
            a = a.replace("  "," ");
        }

        String arr[] = a.split(" ");
        a = "";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        return a.trim();
    }
    public String toString() {
        return id+" "+chuanhoa(name)+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(DateOfBirth)+" "+String.format("%.2f",gpa);
    }

}
