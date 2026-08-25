package Task_10;

public class DiscountedProduct implements OrderItem {
    private double price;
    private double quantity;
    private int discount;

    public DiscountedProduct(double price, double quantity, int discount) {
        if (price <= 0) {
            throw new IllegalArgumentException("Qiymət 0-dan böyük olmalıdır");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Say 0-dan böyük olmalıdır");
        }
        if (discount < 0 ) {
            throw new IllegalArgumentException("Endirim 0 ilə 1 arasında olmalıdır");
        }
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public double calculatePrice() {
        return price * quantity * (1 - discount);
    }
}
