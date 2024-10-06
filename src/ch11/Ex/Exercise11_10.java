package ch11.Ex;

import java.util.*;

// 빙고 숫자가 잘 섞이지 않음
// 복습필요!!
class Exercise11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();
        int[][] board =new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int) (Math.random() * 30) + 1 + "");
        }

        ArrayList list = new ArrayList(set);
        Collections.shuffle(list);

        Iterator it = list.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
