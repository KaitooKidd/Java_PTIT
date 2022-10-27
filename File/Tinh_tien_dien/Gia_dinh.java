package File.Tinh_tien_dien;

import java.util.Objects;

public class Gia_dinh {
    private String name,loai,id;
    private long so_dau,so_cuoi,so_dien,dinh_muc,tien_trong_dm,tien_ngoai_dm,thue_VAT, tien_nop;
    private static int count = 0;
    public Gia_dinh(String name, String s) {
        count++;
        this.id = String.format("KH%02d",count);
        this.name = chuan_hoa(name);

        String[] a = s.split("\\s+");
        this.loai = a[0];
        if(Objects.equals(this.loai, "A")) dinh_muc = 100;
        else if(Objects.equals(this.loai, "B")) dinh_muc = 500;
        else dinh_muc = 200;

        this.so_dau = Long.parseLong(a[1]);
        this.so_cuoi = Long.parseLong(a[2]);
        this.so_dien = so_cuoi-so_dau;
        if(so_dien<dinh_muc) tien_trong_dm = so_dien*450;
        else tien_trong_dm = dinh_muc*450;

        if(so_dien>dinh_muc) tien_ngoai_dm = (so_dien-dinh_muc)*1000;
        else tien_ngoai_dm = 0;

        thue_VAT = 5*tien_ngoai_dm/100;

        tien_nop = tien_trong_dm+tien_ngoai_dm+thue_VAT;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+tien_trong_dm+" "+tien_ngoai_dm+" "+thue_VAT+" "+tien_nop;
    }

    public long getTien_nop() {
        return tien_nop;
    }

    public String chuan_hoa(String s) {
        StringBuilder sb = new StringBuilder();
        String[]a = s.trim().toLowerCase().split("\\s+");
        for(int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
            sb.append(a[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
