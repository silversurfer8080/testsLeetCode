package src.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

// Validate an initial Sudoku matrix: https://leetcode.com/problems/valid-sudoku
public class ValidSudoku36 {
    public static boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet = null;
        Set<Character> colSet = null;

        for (int i = 0; i < 9; i++) {
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char r = board[i][j];
                char c = board[j][i];

                if (r != '.') {
                    if (rowSet.contains(r)) return false;
                    rowSet.add(r);
                }
                if (c != '.') {
                    if (colSet.contains(c)) return false;
                    colSet.add(c);
                }

            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j=0; j < 9; j += 3) {
                if (!checkBlock(board, i, j)) return false;
            }
        }

        return true;
    }

    private static boolean checkBlock(char[][] board, int i, int j) {
        Set<Character> blockSet = new HashSet<>();
        int rows = i + 3;
        int cols = j + 3;

        for (int r = i; r < rows; r++) {
            for (int c = j; c < cols; c++) {
                if (board[r][c] != '.') {
                    if (blockSet.contains(board[r][c])) return false;
                    blockSet.add(board[r][c]);
                }
            }
        }
        return true;
    }
}
