package File;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class So_nguyen_to_trong_2_file {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ghirafile1();
//        ghirafile2();
        int[] P = new int [10000+3];
        int N = 10000;
        Arrays.fill(P,0);
        P[0] = 1; P[1] = 1;
        for(int i = 2; i*i <= N; i++) {
            if(P[i] == 0) {
                for(int j = i*i; j <= N; j+=i)
                    P[j] = 1;
            }
        }

        ObjectInputStream obs1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream obs2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> l1 = (ArrayList) obs1.readObject();
        ArrayList<Integer> l2 = (ArrayList) obs2.readObject();
        TreeMap<Integer,Integer> ma1 = new TreeMap<>();
        TreeMap<Integer,Integer> ma2 = new TreeMap<>();
        for(int i : l1) {
            if(P[i] == 0)
                ma1.put(i, ma1.getOrDefault(i,0)+1);
        }
        for(int i : l2) {
            if(ma1.containsKey(i))
                ma2.put(i,ma2.getOrDefault(i,0)+1);
        }
        for(int i : ma2.keySet()) {
            System.out.println(i+" "+ ma1.get(i) + " " + ma2.get(i));
        }
    }
    public static boolean Isprime(int n) {
        if( n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
//    public static void ghirafile1() throws IOException {
//        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\All Folder\\Javaa\\Data1.in"));
//        ArrayList<Integer> l = new ArrayList<>();
//       for(int i = 2; i < 10000; i++) l.add(i);
//       os.writeObject(l);
//       os.flush();
//    }
//    public static void ghirafile2() throws IOException {
//        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\All Folder\\Javaa\\Data2.in"));
//        ArrayList<Integer> l = new ArrayList<>();
//        for(int i = 2; i < 10000; i++) l.add(i);
//        os.writeObject(l);
//        os.flush();
//    }
}
