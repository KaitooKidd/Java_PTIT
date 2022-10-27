package Lop_va_Doi_tuong.Khai_bao_lop_Point;

public class Point {
    private double x;
    private double y;
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public Point() {
    }
    public Point(Point P) {
        this.x = P.x;
        this.y = P.y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point secondPoint) {
        return Math.sqrt( Math.pow(x - secondPoint.getX(), 2) + Math.pow(y - secondPoint.getY(), 2));
    }
    public double distance(Point p1,Point p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
