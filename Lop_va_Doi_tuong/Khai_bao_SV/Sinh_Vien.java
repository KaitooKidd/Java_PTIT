package Lop_va_Doi_tuong.Khai_bao_SV;

public class Sinh_Vien {
    private String id, name, lop, DateOfBirth;
    private float gpa;

    public Sinh_Vien(String id, String name, String lop, String dateOfBirth, float gpa) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        DateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public float getGpa() {
        return gpa;
    }

    public String SetDateOfBirth() {
        String s[] = DateOfBirth.split("/");
        this.DateOfBirth = "";
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].length() == 1) {
                s[i] = "0" + s[i];
            }
            this.DateOfBirth += s[i] + "/";
        }
        this.DateOfBirth += s[s.length - 1];
        return this.DateOfBirth;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.lop + " " + this.SetDateOfBirth() +" ";
    }
}
