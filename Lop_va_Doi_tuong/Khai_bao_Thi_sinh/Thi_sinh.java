package Lop_va_Doi_tuong.Khai_bao_Thi_sinh;

public class Thi_sinh {
    private String name,DateOfBirth;
    private double d1,d2,d3;

    public Thi_sinh(String name, String dateOfBirth, double d1, double d2, double d3) {
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getD3() {
        return d3;
    }

    public void setD3(double d3) {
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return name + " " + DateOfBirth + " " + Math.round((d1+d2+d3)*10.0)/10.0;
    }
}
