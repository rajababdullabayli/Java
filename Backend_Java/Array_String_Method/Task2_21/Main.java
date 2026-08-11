package Task2_21;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the shift: ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        CeaserEncode ce = new CeaserEncode();
        String newText = ce.caesarEncode(text,shift);
        System.out.println("New Text: "+newText);
    }
}
