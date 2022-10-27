package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class Loai_bo_so_nguyen {
        public static void main(String[] args) throws FileNotFoundException {
            File file=new File("DATA.in");
            Scanner scan=new Scanner(file);
            ArrayList<String> l = new ArrayList<>();
            while(scan.hasNext()){
                String line=scan.next();
                try{
                    int t = Integer.parseInt(line);
                }catch (NumberFormatException e) {
                    l.add(line);
                }
            }
            Collections.sort(l);
            for(String i : l) System.out.print(i+" ");
        }
    }
