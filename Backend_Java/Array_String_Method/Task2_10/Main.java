package Task2_10;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        Compress compress = new Compress();
        String newText = compress.compress(text);
        System.out.println("Compress Text: "+newText);

    }
}
