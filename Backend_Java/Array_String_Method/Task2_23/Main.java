package Task2_23;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array's length: ");
        int length = scanner.nextInt();
        String[] array = new String[length];
        scanner.nextLine();
        System.out.println("Enter the array's elements");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.next();
        }

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String commonPrefix = lcp.longestCommonPrefix(array);

        System.out.println("Longest Common Prefix: "+commonPrefix);
    }
}
