package Mang_Va_Doi_Tuong.Sap_xep_thoi_gian;

public class Time {
    private int hour,minute,second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return hour+" "+minute+" "+second;
    }
}
