package Task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<OrderItem> orderItems = new ArrayList<>();

        String type = input.nextLine();
        try {
            if (type.equals("product")) {
                System.out.println("Qiymət");
                double pPrice = Double.parseDouble(input.nextLine());
                System.out.println("Say");
                int pQuantity = Integer.parseInt(input.nextLine());
                orderItems.add(new Product(pPrice,pQuantity));
            }else if (type.equals("discount")) {
                System.out.print("Qiymət: ");
                double dPrice = Double.parseDouble(input.nextLine());
                System.out.print("Say: ");
                int dQuantity = Integer.parseInt(input.nextLine());
                System.out.print("Endirim faizi ");
                double discount = Double.parseDouble(input.nextLine());
                orderItems.add(new DiscountedProduct(discount,dPrice,dQuantity));
            }else if (type.equals("subscription")) {
                System.out.print("Aylıq ödəniş: ");
                double subPrice = Double.parseDouble(input.nextLine());
                orderItems.add(new Subscription(subPrice));
                System.out.println("Abunəlik uğurla əlavə edildi");
            }else {
                throw new  IllegalArgumentException("Tanınmayan məhsul tipi: " + type);
            }
        }catch (NumberFormatException e) {
            System.out.println("Rəqəm yerinə mətn daxil etdiniz " + type);
        }catch (IllegalArgumentException e) {
            System.out.println("Xəta");
        }

        double price = 0;
        for (OrderItem orderItem : orderItems) {
            price += orderItem.calculatePrice();
        }
        System.out.println(" Bütün sifarişlərin ümumi qiyməti: "+price);
    }
}
