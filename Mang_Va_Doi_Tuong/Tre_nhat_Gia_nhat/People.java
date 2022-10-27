package Mang_Va_Doi_Tuong.Tre_nhat_Gia_nhat;

import java.util.Arrays;

public class People {
    private String name,DateOfBirth;

    public People(String name, String dateOfBirth) {
        this.name = name;
        String arr[] = dateOfBirth.split("/");
        this.DateOfBirth="";
        for(int i = arr.length-1; i >= 0; i--) {
            this.DateOfBirth += arr[i];
        }
    }
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    @Override
    public String toString() {
        return name;
    }
}
