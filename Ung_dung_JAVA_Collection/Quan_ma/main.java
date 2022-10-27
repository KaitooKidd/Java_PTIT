package Ung_dung_JAVA_Collection.Quan_ma;

import java.util.*;

public class main {
    static int[][] d = new int[10][10];
    static int[] X = {-2,-1,1,2,2,1,-1,-2};
    static int[] Y = {-1,-2,-2,-1,1,2,2,1};
    public static int bfs(int x1, int y1, int x2, int y2) {
        Queue<Pair<Integer,Integer>> qu = new LinkedList<>();
        qu.add(new Pair<>(x1,y1));
        d[x1][y1] = 0;
        while (!qu.isEmpty()) {
            Pair<Integer,Integer> pa = qu.poll();
            int i = pa.getFirst();
            int j = pa.getSecond();
            for(int k = 0; k < 8; k++) {
                int i1 = i+X[k];
                int j1 = j+Y[k];
                if(i1 >= 1 && j1 >= 1 && i1 <= 8 && j1 <= 8) {
                    if(i1==x2 && j1 ==y2)
                        return d[i][j]+1;
                    qu.add(new Pair<>(i1,j1));
                    d[i1][j1] = d[i][j] + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String[] arr = sc.nextLine().split("\\s+");
            int x1 = arr[0].charAt(0)-'a' + 1;
            int x2 = arr[1].charAt(0)-'a' + 1;
            int y1 = arr[0].charAt(1)-48;
            int y2 = arr[1].charAt(1)-48;
            if(x1 == x2 && y1 == y2) {
                System.out.println(0);
            }
            else {
                for(int i = 0; i < 10; i++)
                    Arrays.fill(d[i],0);
                System.out.println(bfs(x1,y1,x2,y2));
            }
        }
    }
}