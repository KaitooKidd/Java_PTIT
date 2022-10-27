package File;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Cap_so_nguyen_to_trong_file1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //ghiDuLieuXuongFile();
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream os2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> l1 = (ArrayList<Integer>) os1.readObject();
        ArrayList<Integer> l2 = (ArrayList<Integer>) os2.readObject();
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts1.addAll(l1); ts2.addAll(l2);
        for(int i : ts1) {
            if(nto(i)) {
                int k = 1000000 - i;
// File1               if(i < k && ts2.contains(k)  && nto(k)) {
//                    System.out.println(i+" "+k);
//                }
                if(i < k && ts1.contains(k) && !ts2.contains(i) && !ts2.contains(k) && nto(k))
                    System.out.println(i+" "+k);
            }
        }
    }
    public static boolean nto(int n) {
        if (n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
//    private static void ghiDuLieuXuongFile() throws IOException
//    {
//        OutputStream os = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Javaa\\Data11.in");
//        ObjectOutputStream oos = new ObjectOutputStream(os);
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = 1000000 ; i >= 1000 ;i--)
//            arr.add(i);
//        oos.writeObject(arr);
//        oos.flush();
//    }
}
