package Lop_va_Doi_tuong.Dien_tich_hinh_tron;

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
        return Math.sqrt( Math.pow(this.x - secondPoint.getX(), 2) + Math.pow(this.y - secondPoint.getY(), 2));
    }
    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
    }
}
