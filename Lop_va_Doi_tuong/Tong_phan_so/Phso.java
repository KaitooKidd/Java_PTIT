package Lop_va_Doi_tuong.Tong_phan_so;

import java.util.concurrent.Phaser;

public class Phso {
    private long tu,mau;

    public Phso(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    public long ucln(long a, long b) {
        if(b == 0) return a;
        return ucln(b,a%b);
    }
    public Phso rutgon() {
        long res = ucln(this.tu,this.mau);
        this.tu /= res;
        this.mau /= res;
        return new Phso(this.tu,this.mau);
    }
    public Phso sum(Phso a) {
        Phso P = new Phso(0,0);
        P.tu = this.tu*a.mau + a.tu*this.mau;
        P.mau = this.mau*a.mau;
        return P.rutgon();
    }
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
