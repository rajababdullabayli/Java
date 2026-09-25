package az.rajab.paymentservice.service;

import az.rajab.paymentservice.model.PaymentRequest;
import az.rajab.paymentservice.model.PaymentResponse;

public interface PaymentProcessor {

     PaymentResponse createPayment(PaymentRequest request);

     PaymentResponse getPaymentById(String id);
}
