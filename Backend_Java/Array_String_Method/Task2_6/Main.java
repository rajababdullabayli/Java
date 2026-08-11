package Task2_6;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array's length: ");
        int length = scanner.nextInt();
        System.out.print("Enter the n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[length];
        int sum = 0;

        System.out.println("Enter the array's elements");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            sum+=array[i];
        }

        MissingNumber mn = new MissingNumber();
        int arraySum = mn.findMissingNumber(array,n);
        if (sum-arraySum == 0){
            System.out.println("Not Missing Number");
        }
        else {
            System.out.println("Missing Number is: "+(arraySum - sum));
        }

    }
}
