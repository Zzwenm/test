package com.example.daily.August;

/**
 * 529. 扫雷游戏
 *
 * @author Zzwen
 * @date 2020-8-20 12:57
 */
public class Day11 {

    public static void main(String[] args) {
        int a = 1;
        char ca = Character.forDigit(a,10);
        System.out.println(ca);
    }

    public char[][] updateBoard(char[][] board, int[] click) {
        helper(board, click[0], click[1]);
        return board;
    }

    private void helper(char[][] board, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return;
        }
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        } else if (board[x][y] == 'E') {
            int landmine = getLandmineNumber(board, x, y);
            if (landmine == 0) {
                board[x][y] = 'B';
                helper(board,x-1,y-1);
                helper(board,x-1,y);
                helper(board,x-1,y+1);
                helper(board,x,y-1);
                helper(board,x,y+1);
                helper(board,x+1,y-1);
                helper(board,x+1,y);
                helper(board,x+1,y+1);
            } else {
                board[x][y] = Character.forDigit(landmine,10);
            }
        }
    }

    private int getLandmineNumber(char[][] board, int x, int y) {
        int res = 0;
        if (x - 1 >= 0 && y - 1 >= 0 && board[x - 1][y - 1] == 'M') {
            res++;
        }
        if (x - 1 >= 0 && board[x - 1][y] == 'M') {
            res++;
        }
        if (x - 1 >= 0 && y + 1 < board[x].length && board[x - 1][y + 1] == 'M') {
            res++;
        }
        if (y - 1 >= 0 && board[x][y - 1] == 'M') {
            res++;
        }
        if (y + 1 < board[x].length && board[x][y + 1] == 'M') {
            res++;
        }
        if (x + 1 < board.length && y - 1 >= 0 && board[x + 1][y - 1] == 'M') {
            res++;
        }
        if (x + 1 < board.length && board[x + 1][y] == 'M') {
            res++;
        }
        if (x + 1 < board.length && y + 1 < board[x].length && board[x + 1][y + 1] == 'M') {
            res++;
        }
        return res;
    }

}
