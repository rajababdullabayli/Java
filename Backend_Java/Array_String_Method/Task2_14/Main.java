package Task2_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the matrix's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter the matrix's width: ");
        int width = scanner.nextInt();

        int[][] arrayMatrix = new int[length][width];

        System.out.println("Enter the matrix's elements:");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("element [" + i + "][" + j + "]: ");
                arrayMatrix[i][j] = scanner.nextInt();
            }
        }

        DiagonalSum ds = new DiagonalSum();
        ds.diagonalSum(arrayMatrix);
    }
}
