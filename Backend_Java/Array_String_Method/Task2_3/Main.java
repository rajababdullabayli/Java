package Task2_3;

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

        Sorted sorted = new Sorted();
        boolean result = sorted.isSorted(array);
        if (result) {
            System.out.println("Sorted: "+ result);
        }
        else{
            System.out.println("Not Sorted: "+result);
        }
    }
}
