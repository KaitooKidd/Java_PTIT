package Mang_Va_Doi_Tuong.Tinh_gio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Game implements Comparable<Game>{
    private String id,name;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private int hour,minute;
    public Game(String id, String name,String time1,String time2) {
        this.id = id;
        this.name = name;
        this.hour = Integer.parseInt(time2.substring(0,2))- Integer.parseInt(time1.substring(0,2));
        this.minute = Integer.parseInt(time2.substring(3))- Integer.parseInt(time1.substring(3));
        if(this.minute < 0) {
            this.hour -= 1;
            this.minute += 60;
        }
    }
    public int compareTo(Game a) {
        if(a.getHour() != this.getHour())
            return (int)(a.getHour()-this.getHour());
        return (int)(a.getMinute()-this.getMinute());
    }
    public String toString() {
        return id+" "+name+" "+hour+" gio "+minute+" phut";
    }
}
