package Task2_19;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int numb1 = scanner.nextInt();
        System.out.print("Enter the number2: ");
        int numb2 = scanner.nextInt();

        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        int gCD = gcd.gcd(numb1,numb2);
        System.out.println("This numbers greatest common divisor is: "+ gCD);
    }
}
