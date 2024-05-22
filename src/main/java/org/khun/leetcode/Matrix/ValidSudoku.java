package org.khun.leetcode.Matrix;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        // Arrays to keep track of seen digits in rows, columns, and sub-boxes
        boolean[][] rowSeen = new boolean[9][9];
        boolean[][] colSeen = new boolean[9][9];
        boolean[][] boxSeen = new boolean[9][9];

        // Iterate through the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Check if the cell is filled
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1'; // Convert char to integer

                    // Check if the number is already seen in the row, column, or sub-box
                    if (rowSeen[i][num] || colSeen[j][num] || boxSeen[i / 3 * 3 + j / 3][num]) {
                        return false; // If seen, the board is invalid
                    }

                    // Mark the number as seen in the row, column, and sub-box
                    rowSeen[i][num] = true;
                    colSeen[j][num] = true;
                    boxSeen[i / 3 * 3 + j / 3][num] = true;
                }
            }
        }

        return true; // If all checks passed, the board is valid
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] board1 = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
        System.out.println(isValidSudoku(board1));
    }
}
