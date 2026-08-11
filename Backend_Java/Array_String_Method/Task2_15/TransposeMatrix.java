package Task2_15;

public class TransposeMatrix {
    /*
    1,2,3         1,4
    4,5,6         2,5
                  3,6
     */
    public void transpose(int[][] matrix){
        int length = matrix.length;
        int width = matrix[0].length;
        int[][] transposeMatrix = new int[width][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose matrix:");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
