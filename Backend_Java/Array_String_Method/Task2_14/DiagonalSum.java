package Task2_14;

public class DiagonalSum {
    public void diagonalSum(int[][] matrix) {
        int sumMainDiagonal = 0;
        int sumOppositeDiagonal = 0;
        int l = matrix.length;

        for (int i = 0; i < l; i++) {
            sumMainDiagonal += matrix[i][i];
            sumOppositeDiagonal += matrix[i][l-1-i];
        }

        System.out.println("Sum Main Diagonal: " + sumMainDiagonal);
        System.out.println("Sum Opposite Diagonal: " + sumOppositeDiagonal);
    }
}
