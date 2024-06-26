package ru.job4j.array;

public class MatrixCheck1 {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int colum) {
        boolean result = true;
        for (int row = 0; row < board[colum].length; row++) {
            if (board[row][colum] == ' ') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if ( monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
            }
        }
        return result;
    }
}
