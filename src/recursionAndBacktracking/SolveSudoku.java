package recursionAndBacktracking;

public class SolveSudoku {
    public static void main(String[] args) {
        char[][] arr = {
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
        solveSudoku(arr);
    }

    public static void solveSudoku(char[][] arr) {
        if (sudokuSolver(arr, 0, 0)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
    }

    public static boolean sudokuSolver(char[][] arr, int x, int y) {
        if (x == arr.length) {
            return true;
        }

        int nx = y == 8 ? x + 1 : x;
        int ny = y == 8 ? 0 : y + 1;

        if (arr[x][y] == '.') {
            for (int val = 1; val <= 9; val++) {
                if (canWePlace(arr, x, y, val)) {
                    arr[x][y] = (char) (val + '0');
                    if (sudokuSolver(arr, nx, ny)) {
                        return true;
                    }
                    arr[x][y] = '.';
                }
            }
        } else {
            if (sudokuSolver(arr, nx, ny)) {
                return true;
            }
        }
        return false;
    }

    public static boolean canWePlace(char[][] arr, int x, int y, int val) {
        // Check Row
        for (int col = 0; col < arr[0].length; col++) {
            if (arr[x][col] == (char) (val + '0')) {
                return false;
            }
        }

        // Check Column
        for (int row = 0; row < arr.length; row++) {
            if (arr[row][y] == (char) (val + '0')) {
                return false;
            }
        }

        // Check 3x3 Grid
        int subGridRowStart = x - (x % 3);
        int subGridColStart = y - (y % 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[subGridRowStart + i][subGridColStart + j] == (char) (val + '0')) {
                    return false;
                }
            }
        }
        return true;
    }
}
