package Task2_12;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        ReverseEachWords rew = new ReverseEachWords();
        String newSentence = rew.reverseEachWord(sentence);
        System.out.println("Reverse Each Words: "+newSentence);
    }
}
