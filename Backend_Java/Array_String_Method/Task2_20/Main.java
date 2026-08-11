package Task2_20;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the array's length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        scanner.nextLine();
        System.out.println("Enter the array's elements");

        for (int i=0;i<length;i++){
            array[i] = scanner.nextInt();
        }

        BinarySearch bs = new BinarySearch();
        int binarySearch = bs.binarySearch(array,target);
        if (binarySearch != -1){
            System.out.println("Found,index: "+binarySearch);
        }
        else {
            System.out.println("Not Found: "+binarySearch);
        }
    }
}
