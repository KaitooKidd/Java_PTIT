package Lop_va_Doi_tuong.Phan_So;

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
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
