package Task_4;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Enter the number's index: ");
        String imIndex = sc.next();
        try {
            int index = Integer.parseInt(imIndex);
            int element = numbers[index];
            System.out.println("Nəticə: " + element);
        } catch (NumberFormatException e) {
            System.out.println("Yanlış integer formatı");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Yanlış index");
        }
    }
}
