package recursionAndBacktracking;

public class NQueens {
    public static void main(String[] args) {
        int row = 0, n = 4;
        char[][] arr = new char[n][n];
        boolean[] cols= new boolean[0],d1=new boolean[0],d2 = new boolean[0];
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j< arr.length;j++) {
                arr[i][j] = '*';
            }
        }
        nQueens(arr, row, cols, d1, d2);
    }



    public static void nQueens(char[][] arr, int row, boolean[] cols, boolean[] d1, boolean[] d2) {
        if (row == arr.length) {
            printQueens(arr);
            System.out.println("_______________");
            return;
        }

        for (int col=0;col<arr[0].length;col++){
            if (cols[col] == false && d1[row+col] == false && d2[row - col + arr.length-1] == false){
                arr[row][col] = 'Q';
                cols[col] = true;
                d1[row + col] = true;
                d2[row - col + arr.length-1] = true;
                nQueens(arr, row+1, cols, d1, d2);
                arr[row][col] = '*';
                cols[col] = false;
                d1[row+col] = false;
                d2[row-col + arr.length-1] = false;
            }
        }

    }

    public static void printQueens(char[][] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j< arr.length;j++) {
                System.out.print(arr[i][j] = ' ');
            }
            System.out.println();
        }
    }

}
