package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hello_file {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner scan=new Scanner(file);
        while(scan.hasNext()){
            String line=scan.nextLine();
            System.out.println(line);
        }
    }
}
