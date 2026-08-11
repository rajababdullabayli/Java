package Task2_7;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        VowelsConsonants vc = new VowelsConsonants();
        vc.countVowelsConsonants(text);
    }
}
