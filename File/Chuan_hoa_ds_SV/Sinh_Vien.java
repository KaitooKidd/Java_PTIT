package File.Chuan_hoa_ds_SV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Sinh_Vien {
    private String id,name, lop;
    private double gpa;
    private static int count = 0;
    private Date ns;

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ns)+" "+String.format("%.2f",gpa);
    }

    public Sinh_Vien(String name, String lop, String nss, double gpa) throws ParseException {
        count++;
        this.id = String.format("B20DCCN0%02d",count);
        this.name = chuanhoa(name);
        this.lop = lop;
        this.gpa = gpa;
        this.ns =  new SimpleDateFormat("d/MM/yyyy").parse(nss);

    }

    public String chuanhoa(String s) {
        String[] arr = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)));
            sb.append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

}
