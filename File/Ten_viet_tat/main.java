package File.Ten_viet_tat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, ArrayList<Person>> ma = new HashMap<>();
        while (t-->0) {
            Person p = new Person(sc.nextLine());
            String vt = p.getViet_tat();
            for(int i = 0; i < vt.length(); i+=2) {
                String tmp=vt.substring(0,i)+"*"+vt.substring(i+1);
                if(ma.get(tmp) != null) {
                    ma.get(tmp).add(p);
                }
                else {
                    ArrayList<Person> l = new ArrayList<>();
                    l.add(p);
                    ma.put(tmp,l);
                }
            }
        }
        for(String i : ma.keySet()) {
            Collections.sort(ma.get(i));
        }
        int n = Integer.parseInt(sc.nextLine());
        while (n-->0) {
            String s = sc.nextLine();
            ArrayList<Person> ll = ma.get(s);
            for(Person i : ll) System.out.println(i);
        }
    }
}
