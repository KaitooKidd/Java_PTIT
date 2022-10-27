package File;

import java.io.*;
import java.util.ArrayList;

public class Tong_chu_so {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ghirafile();
        ObjectInputStream obs = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> l = (ArrayList<String>) obs.readObject();
        for(String i : l) {
            String res = so(i);
            System.out.println(res+" "+sum(res));
        }
    }
    public static long sum(String i) {
        long sum = 0;
        for(int j = 0; j < i.length(); j++)
            sum += i.charAt(j)-48;
        return sum;
    }
    public static String so(String str) {
        String res = "";
        int ind = 0;
        for (int i = 0; i < str.length(); i++) {
            char p = str.charAt(i);
            if (Character.isDigit(p)) {
                res+=p;
            }
        }
        for (int i = 0; i < res.length(); i++) {
            char p = res.charAt(i);
            if (p != '0') {
                ind = i;
                break;
            }
        }
        return res.substring(ind);
    }
    public static void ghirafile() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\All Folder\\Javaa\\Data1.in"));
        ArrayList<String> l = new ArrayList<>();
        l.add("Jhsf00dklT12uhf780LPPZH");
        l.add("AAAAddd0000000000000000001T");
        os.writeObject(l);
        os.flush();
    }
}
