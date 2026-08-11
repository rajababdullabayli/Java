package Task2_17;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fibonacci index: ");
        int fibonacciIndex = sc.nextInt();

        FibonacciRecursive fr = new FibonacciRecursive();
        int fbRecursive = fr.fibonacciRecursive(fibonacciIndex);
        System.out.println("Fibonacci Index "+fibonacciIndex+": "+fbRecursive);

        FibonacciIterative fi = new FibonacciIterative();
        int fbIterative = fi.fibonacciIterative(fibonacciIndex);
        System.out.println("Fibonacci Index "+fibonacciIndex+": "+fbIterative);
    }
}
