package az.rajab.paymentservice3.controller;

import az.rajab.paymentservice3.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @DeleteMapping("/payments/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/users/{userId}/payments/total")
    public ResponseEntity<BigDecimal> getTotalSuccessPayments(@PathVariable Long userId) {
        BigDecimal total = paymentService.getTotalSuccessPayments(userId);
        return ResponseEntity.ok(total);
    }
}
