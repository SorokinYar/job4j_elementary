package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatrixCheck1Test {

    @Test
    void whenRowFullXTrue() {
        char[][] array = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixCheck1.monoHorizontal(array, row);
        assertThat(result).isTrue();
    }

    @Test
    void whenRowFullXFalse() {
        char[][] array = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 0;
        boolean result = MatrixCheck1.monoHorizontal(array, row);
        assertThat(result).isFalse();
    }

    @Test
    void whenColumFullXTrue() {
        char[][] board = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', 'X', ' '}
        };
        int colum = 1;
        boolean result = MatrixCheck1.monoVertical(board, colum);
        assertThat(result).isTrue();
    }

    @Test
    void whenColumFullXFalse() {
        char[][] board = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int colum = 0;
        boolean result = MatrixCheck1.monoVertical(board, colum);
        assertThat(result).isFalse();
    }

    @Test
    void whenExtractDiagonalTrue() {
        char[][] board = {
                {' ', 'X', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        char[] expected = {' ', 'X', ' '};
        char[] result = MatrixCheck1.extractDiagonal(board);
        assertThat(result).contains(expected);
    }

    @Test
    void whenMonoArrayTrue() {
        char[][] board = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck1.isWin(board);
        assertThat(result).isTrue();
    }

    @Test
    void whenMonoArrayFalse() {
        char[][] board = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck1.isWin(board);
        assertThat(result).isFalse();
    }

}


