package Task2_18;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int numb = sc.nextInt();

        Prime prime = new Prime();
        boolean result = prime.isPrime(numb);
        System.out.println("This Number is prime number: "+result);
    }
}
