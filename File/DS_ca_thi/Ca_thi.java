package File.DS_ca_thi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Ca_thi implements Comparable<Ca_thi> {
    private String id,phong_thi;
    private Date ngay,gio;
    private static int count = 0;
    public Ca_thi(String ng,String gio,String phong) throws ParseException {
        count++;
        this.id = String.format("C%03d",count);
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ng);
        this.gio = new SimpleDateFormat("HH:mm").parse(gio);
        this.phong_thi = phong;
    }

    public Date getNgay() {
        return ngay;
    }

    public Date getGio() {
        return gio;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngay)+" "+new SimpleDateFormat("HH:mm").format(gio)+" "+phong_thi;
    }

    @Override
    public int compareTo(Ca_thi o) {
        if(this.ngay.compareTo(o.getNgay()) > 0)
            return 1;
        else if(this.ngay.compareTo(o.getNgay()) == 0) {
            if(this.gio.compareTo(o.getGio()) > 0)
                return 1;
            else if(this.gio.compareTo(o.getGio()) == 0)
                return this.id.compareTo(o.getId());
        }
        return -1;
    }
}
