package Task2_11;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        CountWords cw = new CountWords();
        int countWords = cw.countWords(sentence);
        System.out.println("Count Words: "+countWords);
    }
}
