package Task2_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array's length: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[length];

        System.out.println("Enter the array's elements");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println(Arrays.toString(rd.removeDuplicates(array)));
    }
}
