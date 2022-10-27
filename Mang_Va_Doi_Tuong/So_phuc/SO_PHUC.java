package Mang_Va_Doi_Tuong.So_phuc;

public class SO_PHUC {
    private int thuc,ao;

    public SO_PHUC(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public int getThua() {
        return thuc;
    }

    public int getAo() {
        return ao;
    }
    public SO_PHUC  add(SO_PHUC a) {
        return new SO_PHUC(this.thuc+a.thuc,this.ao+a.ao);
    }
    public SO_PHUC mutil(SO_PHUC a) {
        int phan_thuc = this.thuc*a.thuc - this.ao*a.ao;
        int phan_ao = this.thuc*a.ao + this.ao*a.thuc;
        return new SO_PHUC(phan_thuc,phan_ao);
    }
    public String toString() {
        return thuc+" + "+ao+"i";
    }
}
