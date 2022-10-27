package File.Dang_ki_ht_Giang_day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Mon_hoc> l = new ArrayList<>();
        while (t-->0) {
            Mon_hoc a = new Mon_hoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine());
            if(Objects.equals(a.getThuc_hanh(), "Truc tuyen") || a.getThuc_hanh().endsWith(".ptit.edu.vn"))
                l.add(a);
        }
        Collections.sort(l, new Comparator<Mon_hoc>() {
            @Override
            public int compare(Mon_hoc o1, Mon_hoc o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(Mon_hoc a : l) System.out.println(a);
    }
}
