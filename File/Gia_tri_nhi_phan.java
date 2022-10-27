package File;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Gia_tri_nhi_phan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      //  ghiDuLieuXuongFile();
        ObjectInputStream obs = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> l = (ArrayList<String>) obs.readObject();
        for(String i : l) {
            String tmp = "";
            for(int j = 0; j < i.length(); j++) {
                if(i.charAt(j) == '0' || i.charAt(j) == '1')
                    tmp+=i.charAt(j);
            }
            if(!Objects.equals(tmp,""))
                System.out.println(tmp+" "+Long.parseLong(tmp,2));
        }
    }
//        private static void ghiDuLieuXuongFile() throws IOException {
//        OutputStream os = new FileOutputStream("C:\\Users\\Admin\\Desktop\\All Folder\\Javaa\\Data1.in");
//        ObjectOutputStream oos = new ObjectOutputStream(os);
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("5678321010286421");
//        arr.add("9999999000000000000000000");
//        oos.writeObject(arr);
//        oos.flush();
//    }
}
