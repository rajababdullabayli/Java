package Task2_9;


import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        Numeric numeric = new Numeric();
        boolean result =  numeric.isNumeric(text);

        if (result){
            System.out.println("This text is numeric: "+result);
        }
        else {
            System.out.println("This text is numeric: "+result);

        }
    }
}
