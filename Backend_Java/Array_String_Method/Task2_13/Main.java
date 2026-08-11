package Task2_13;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        FirstNonRepeatingChar fnrc = new FirstNonRepeatingChar();
        char firstNonRepeatingChar = fnrc.firstNonRepeatingChar(text);
        System.out.println(firstNonRepeatingChar);
    }
}
