package File.Thoi_gian_OnLine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sinh_vien implements Comparable<Sinh_vien>{
    private String hoTen;

    private long soGio;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Sinh_vien(String HOTEN, String THOIGIANBATDAU, String THOIGIANKETTHUC) throws ParseException
    {
        this.hoTen = HOTEN;

        Date d1 = sdf.parse(THOIGIANBATDAU);
        Date d2 = sdf.parse(THOIGIANKETTHUC);

        this.soGio = ( d2.getTime() - d1.getTime() ) / 1000 / 60;
    }

    @Override
    public int compareTo(Sinh_vien o)
    {
        if(soGio < o.soGio)
            return 1;
        else if(soGio == o.soGio)
        {
            if(hoTen.compareTo(o.hoTen) > 0)
                return 1;
        }
        return -1;
    }

    @Override
    public String toString()
    {
        return hoTen + " " +
                soGio;
    }
}
