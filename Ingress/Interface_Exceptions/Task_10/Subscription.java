package Task_10;

public class Subscription implements OrderItem {
    private double monthlyPrice;

    public Subscription(double monthlyPrice) {
        if (monthlyPrice <= 0) {
            throw new IllegalArgumentException("Aylıq ödəniş 0-dan böyük olmalıdır");
        }
        this.monthlyPrice = monthlyPrice;
    }

    @Override
    public double calculatePrice() {
        return monthlyPrice;
    }
}
