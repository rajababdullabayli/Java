package az.rajab.paymentservice.entity;

import az.rajab.paymentservice.model.PaymentMethod;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Payment {

    private String id;
    private String userName;
    private String email;
    private BigDecimal amount;
    private PaymentMethod paymentMethod;

    public Payment(String userName, String email, BigDecimal amount, PaymentMethod paymentMethod) {
        this.userName = userName;
        this.email = email;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.id = UUID.randomUUID().toString();
    }

    public Payment() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(email, payment.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
