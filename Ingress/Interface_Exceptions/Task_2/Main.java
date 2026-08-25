package Task_2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teh age: ");
        String imAge = sc.next();

        try {
            int age = Integer.parseInt(imAge);
            System.out.println("Yaş: "+age);
        }catch (NumberFormatException e ){
            System.out.println("Yanlış yaş formatı!");
        }
    }
}
