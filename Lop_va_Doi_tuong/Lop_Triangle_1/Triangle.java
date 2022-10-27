package Lop_va_Doi_tuong.Lop_Triangle_1;

public class Triangle {
    private Point a, b, c;
    private double c1,c2,c3;

    public Triangle(Point a, Point b, Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        c1 = a.distance(b);
        c2 = a.distance(c);
        c3 = b.distance(c);
    }

    public boolean valid()
    {
        if( c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1)
            return true;
        return false;
    }

    public String getPerimeter() {
        return String.format("%.3f\n", c1 + c2 + c3);
    }
}
