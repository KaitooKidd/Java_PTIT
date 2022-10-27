package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tinh_tong {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner scan=new Scanner(file);
        long sum = 0;
        while(scan.hasNext()){
            String line=scan.next();
            try{
                sum += Integer.parseInt(line);
            }catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(sum);
    }
}
