import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by MAXIMILLION on 12/8/14.
 */

public class MagicSquare {

    final int MAX = 4;

    public int sumRow(int[][] square, int row) {
        int sum = 0;
        for (int col = 0; col < square[0].length; col++) {
            sum += square[row][col];
        }
        return sum;
    }

    public int sumCol(int[][] square, int col) {
        int sum = 0;
        for (int row = 0; row < square.length; row++) {
            sum += square[row][col];
        }
        return sum;
    }

    public int diagonals(int[][] square){
        int firstSum = 0;
        int secondSum = 0;
        int row = 0;
        for (int col = 0; col < square[0].length; col++){
            firstSum += square[row][col];
        }
        row = square.length - 1;
        for (int col = 0; col < square[0].length; col++){
            secondSum += square[row][col];
            row--;
        }
        if (firstSum == secondSum){
            return firstSum;
        }else{
            return -1;
        }
    }

    public boolean unique(int[][] square) {
        for (int num = 1; num <= MAX*MAX; num++){
            if (!(findNumber(num, square))){
                return false;
            }
        }
        return true;
    }

    private boolean findNumber(int num, int[][] square) {
        for (int row = 0; row < MAX; row++){
            for(int col = 0; col < MAX; col++){
                if (square[row][col] == num){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean perfect(int[][] square){
        int rowSum = sumRow(square, 0);
        for (int row = 1; row < MAX; row++){
            if (sumRow(square, row) != rowSum){
                return false;
            }
        }
        int colSum = sumCol(square, 0);
        for (int col = 1; col < MAX; col++){
            if (sumCol(square, col) != colSum){
                return false;
            }
        }
        int diagonalSum = diagonals(square);
        if (rowSum != colSum){
            return false;
        }else if (!unique(square)){
            return false;
        }else if (diagonalSum != rowSum || diagonalSum != colSum){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MagicSquare square = new MagicSquare();
        int[][] perfectFour = new int[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
        for (int i = 0; i < perfectFour.length; i++) {
            System.out.println("perfectFour = " + Arrays.toString(perfectFour[i]));
        }
        square.sumRow(perfectFour, 0);
        boolean unique = square.unique(perfectFour);
        System.out.println("unique = " + unique);
        boolean perfect = square.perfect(perfectFour);
        System.out.println("perfect = " + perfect);
    }

}
