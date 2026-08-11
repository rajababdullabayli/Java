package Task2_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array1's length: ");
        int array1Length = scanner.nextInt();
        scanner.nextLine();
        int[] array1 = new int[array1Length];
        System.out.print("Enter the array2's length: ");
        int array2Length = scanner.nextInt();
        scanner.nextLine();
        int[] array2 = new int[array2Length];

        System.out.println("Enter the array1's elements");
        for (int i = 0; i < array1Length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter the array2's elements");
        for (int j = 0; j < array2Length; j++) {
            array2[j] = scanner.nextInt();
        }
        MergeSorted ms = new MergeSorted();
        System.out.println(Arrays.toString(ms.mergeSorted(array1,array2)));
    }
}
