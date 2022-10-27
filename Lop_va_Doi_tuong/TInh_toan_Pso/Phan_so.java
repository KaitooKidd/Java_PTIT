package Lop_va_Doi_tuong.TInh_toan_Pso;

public class Phan_so {
    private long tu,mau;

    public Phan_so() {
    }

    public Phan_so(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long ucln(long a, long b) {
        if(b == 0) return a;
        return ucln(b,a%b);
    }
    public Phan_so rutgon() {
        long res = ucln(this.tu,this.mau);
        this.tu /= res;
        this.mau /= res;
        return new Phan_so(this.tu,this.mau);
    }
    public Phan_so sum(Phan_so a) {
        Phan_so tong = new Phan_so();
        tong.mau = this.mau * a.mau;
        tong.tu = this.tu*a.mau+this.mau*a.tu;
        return tong.rutgon();
    }
    public Phan_so nhan(Phan_so a) {
        return new Phan_so(a.tu*this.tu,a.mau*this.mau).rutgon();
    }
    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
