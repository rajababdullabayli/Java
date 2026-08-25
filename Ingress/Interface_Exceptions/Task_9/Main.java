package Task_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Shape: ");
            String shapeName = scanner.next().toLowerCase();

            Shape shape = null;

            if (shapeName.equals("circle")) {
                System.out.print("Radius: ");
                double radius = Double.parseDouble(scanner.next());
                shape = new Circle(radius);
            } else if (shapeName.equals("rectangle")) {
                System.out.print("Width: ");
                double width = Double.parseDouble(scanner.next());
                System.out.print("Height: ");
                double height = Double.parseDouble(scanner.next());
                shape = new Rectangle(width, height);
            } else if (shapeName.equals("triangle")) {
                System.out.print("Base: ");
                double base = Double.parseDouble(scanner.next());
                System.out.print("Height: ");
                double height = Double.parseDouble(scanner.next());
                shape = new Triangle(base, height);
            } else {
                throw new IllegalArgumentException("Dəstəklənməyən shape: " + shapeName);
            }

            System.out.println("Area: " + shape.calculateArea());

        } catch (NumberFormatException e) {
            System.out.println("Xəta");
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta");
        }
    }
}
