package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            int j = i;
            result[i] = board[j][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        int j = 0;
        for (int i = 0; i < board.length; i++) {
            j = i;
            if (board[i][j] == 'X') {
                boolean horizontal = monoHorizontal(board, i);
                boolean vertical = monoVertical(board, j);
                if (horizontal || vertical) {
                    result = true;
                }
                break;
            }
        }
        return result;
    }
}
