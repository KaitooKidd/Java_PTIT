package File.DSKH_trong_file;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KH implements Comparable<KH>{

    private String id,name,sex,address;
    private Date ns;
    private static int count = 0;

    public KH(String name, String sex,String nss, String address) throws ParseException {
        count++;
        this.id = String.format("KH0%02d",count);
        this.name = chuanhoa(name);
        this.sex = sex;
        this.address = address;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(nss);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + address + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns);
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

    @Override
    public int compareTo(KH o) {
        if(this.ns.getTime() < o.ns.getTime())
            return -1;
        return 1;
    }
}
