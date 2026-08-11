package Task2_22;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = scanner.nextInt();
        System.out.print("Enter the array's length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        scanner.nextLine();
        System.out.println("Enter the array's elements");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        PairsWithSum pws = new PairsWithSum();
        int pairs = pws.findPairsWithSum(array,target);

    }
}
