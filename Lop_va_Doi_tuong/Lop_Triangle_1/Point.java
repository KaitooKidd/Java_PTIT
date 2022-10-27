package Lop_va_Doi_tuong.Lop_Triangle_1;

import java.util.Scanner;

public class Point {
    private float x , y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public double distance(Point p)
    {
        return Math.sqrt( Math.pow(x - p.getX(), 2) + Math.pow( y - p.getY(), 2));
    }
    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextFloat(), sc.nextFloat());
    }

}
