package com.example.daily.August;

/**
 * 130. 被围绕的区域
 * 只有与在边界相连的O才会被保留，其余的O都是被包围的。
 * 因为只有 被包围的 和 未被包围的
 * 而为被包围的都是与边界相连的
 *
 * @author Zzwen
 * @date 2020-8-11 9:36
 */
public class DayTwo {

    public void solve(char[][] board) {
        int li = board.length;
        if (li == 0) {
            return;
        }
        int lj = board[0].length;
        for (int i = 0; i < li; i++) {
            dfs(i, 0, board);
            dfs(i, lj - 1, board);
        }
        for (int i = 0; i < lj; i++) {
            dfs(0, i, board);
            dfs(li - 1, i, board);
        }
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < lj; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(int i, int j, char[][] board) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'A';
        dfs(i - 1, j, board);
        dfs(i + 1, j, board);
        dfs(i, j - 1, board);
        dfs(i, j + 1, board);
    }
}
