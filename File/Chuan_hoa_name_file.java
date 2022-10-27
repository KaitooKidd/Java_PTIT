package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Chuan_hoa_name_file {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if(Objects.equals(line, "END")) break;
            System.out.println(chuanhoa(line));
        }
    }
    public static String chuanhoa(String s) {
        String[] a = s.toLowerCase().trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String i : a) {
           sb.append(Character.toUpperCase(i.charAt(0)));
            for(int j = 1; j < i.length(); j++)
                sb.append(i.charAt(j));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
