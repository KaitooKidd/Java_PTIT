package Lop_va_Doi_tuong.Bon_diem_tren_mp;


public class Point3D {
    private int x,y,z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public static Point3D vecctor(Point3D A, Point3D B)
    {
        Point3D AB = new Point3D(B.x - A.x,B.y - A.y,B.z - A.z);
        return AB;
    }
    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
        Point3D AB = vecctor(A,B);
        Point3D AC = vecctor(A,C);
        Point3D AD = vecctor(A,D);
        return  (AB.y * AC.z - AB.z * AC.y) * AD.x +  (AB.z * AC.x - AB.x * AC.z) * AD.y + (AB.x * AC.y - AB.y * AC.x) * AD.z == 0;
    }
}
