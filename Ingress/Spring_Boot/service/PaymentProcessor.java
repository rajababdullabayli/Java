package az.aladdin.paymentservice.service;

import az.aladdin.paymentservice.model.PaymentRequest;
import az.aladdin.paymentservice.model.PaymentResponse;

public interface PaymentProcessor {

     PaymentResponse createPayment(PaymentRequest request);

     PaymentResponse getPaymentById(String id);
}
