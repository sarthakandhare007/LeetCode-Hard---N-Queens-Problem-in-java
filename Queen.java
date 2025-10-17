import java.util.*;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for (char[] row : board) Arrays.fill(row, '.');
        
        backtrack(result, board, 0);
        return result;
    }

    private static void backtrack(List<List<String>> result, char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(result, board, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // Check diagonal (top-left)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Check diagonal (top-right)
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] row : board) path.add(new String(row));
        return path;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> sol : solutions) {
            for (String row : sol) System.out.println(row);
            System.out.println();
        }
    }
}
