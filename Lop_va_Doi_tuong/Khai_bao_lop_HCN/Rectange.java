package Lop_va_Doi_tuong.Khai_bao_lop_HCN;

public class Rectange {
    private double width;
    private double height;
    private String color;
    public Rectange() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public int findArea() {
        return (int)this.height*(int)this.width;
    }
    public int findPerimeter() {
        return (int)(this.width+this.height)*2;
    }
    public String convert(String s) {
        String res = "";
        res += Character.toUpperCase(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
            res += Character.toLowerCase(s.charAt(i));
        return res;
    }
    public String toString() {
        return this.findPerimeter() + " " + this.findArea() + " " + this.convert(this.color);
    }
}
