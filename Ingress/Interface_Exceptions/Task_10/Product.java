package Task_10;

public class Product implements OrderItem {
    private double price;
    private int quantity;

    public Product(double price, int quantity) {
        if (price <= 0) {
            throw new IllegalArgumentException("Qiymət 0-dan böyük olmalıdır");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Say 0-dan böyük olmalıdır");
        }
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        return price * quantity;
    }
}
