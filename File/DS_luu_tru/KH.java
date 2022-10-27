package File.DS_luu_tru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KH {
    private String name;
    private String id_phong;
    private String id;
    Date ngay_den,ngay_di;
    private static int count=0;
    private long luu_tru;
    public long getLuu_tru() {
        return luu_tru;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+id_phong+" "+luu_tru;
    }

    public KH(String name, String id_phong, String den, String di) throws ParseException {
        count++;
        if(count<10) id = "KH0"+count;
        else id = "KH"+count;
        this.name = name;
        this.id_phong = id_phong;
        this.ngay_den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.ngay_di = new SimpleDateFormat("dd/MM/yyyy").parse(di);
        this.luu_tru = (ngay_di.getTime()-ngay_den.getTime())/(24*3600*1000);
    }
}
