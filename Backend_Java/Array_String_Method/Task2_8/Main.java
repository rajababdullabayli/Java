package Task2_8;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        RemoveSpaces rs = new RemoveSpaces();
        String newText = rs.removeSpaces(text);
        System.out.println(newText);
    }
}
