package az.aladdin.paymentservice.service;

import az.aladdin.paymentservice.entity.Payment;
import az.aladdin.paymentservice.mapper.PaymentMapper;
import az.aladdin.paymentservice.model.PaymentRequest;
import az.aladdin.paymentservice.model.PaymentResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaymentProcessorHandler implements PaymentProcessor {

    public List<Payment> payments = new ArrayList<>();

    @Override
    public PaymentResponse createPayment(PaymentRequest request) {
        var payment = PaymentMapper.mapToPayment(request);
        payments.add(payment);
        return PaymentMapper.mapToPaymentResponse(payment);
    }

    @Override
    public PaymentResponse getPaymentById(String id) {
        Optional<Payment> optionalPayment = payments.stream()
                .filter(payment -> payment.getId().equals(id))
                .findFirst();

        if (optionalPayment.isPresent()) {
            var payment = optionalPayment.get();
            return PaymentMapper.mapToPaymentResponse(payment);
        } else {
            return null;
        }
    }
}



