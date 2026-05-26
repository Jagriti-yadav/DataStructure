import java.util.*;

public class NQueens {

    static List<List<String>> solutions = new ArrayList<>();

    public static void solve(char[][] board, int row, int N) {

        if (row == N) {

            List<String> current = new ArrayList<>();

            for(int i=0;i<N;i++) {
                current.add(new String(board[i]));
            }

            solutions.add(current);
            return;
        }

        for(int col=0; col<N; col++) {

            if(isSafe(board,row,col,N)) {

                board[row][col] = 'Q';

                solve(board,row+1,N);

                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board,int row,int col,int N) {

        // column check
        for(int i=0;i<row;i++)
            if(board[i][col]=='Q')
                return false;

        // upper-left diagonal
        for(int i=row-1,j=col-1;
            i>=0 && j>=0;
            i--,j--)
            if(board[i][j]=='Q')
                return false;

        // upper-right diagonal
        for(int i=row-1,j=col+1;
            i>=0 && j<N;
            i--,j++)
            if(board[i][j]=='Q')
                return false;

        return true;
    }

    public static void main(String[] args) {

        int N = 5;

        char[][] board = new char[N][N];

        for(int i=0;i<N;i++)
            Arrays.fill(board[i], '.');

        solve(board,0,N);

        System.out.println("Total Solutions: " + solutions.size());

        for(List<String> sol : solutions) {

            for(String row : sol)
                System.out.println(row);

            System.out.println();
        }
    }
}