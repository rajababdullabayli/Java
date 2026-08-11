package Task2_16;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the factorial number: ");
        int fcNumb = sc.nextInt();

        Factorial fc = new Factorial();
        int factorial = fc.factorial(fcNumb);
        System.out.println("Factorial: "+factorial);
    }
}
