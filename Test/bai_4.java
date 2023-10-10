package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bai_4 {
    public static String solution(int n) {
        Queue<String> queue = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();
        queue.add("H"); queue.add("T");
        list.add("H"); list.add("T");
        while (queue.peek().length() < n) {
            String top = queue.poll();
            queue.add(top + "H");
            queue.add(top + "T");
            list.add(top + "H");
            list.add(top + "T");
        }
        String result = "";
        for(String s : list) {
            if(s.length() == n)
                result += s+',';
        }
        return result.substring(0,result.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            System.out.println(solution(n));
            t--;
        }
    }
}
