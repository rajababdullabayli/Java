package az.rajab.paymentservice2.controller;

import az.rajab.paymentservice2.dao.entity.PaymentEntity;
import az.rajab.paymentservice2.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping()
    public String pay(@RequestParam String userName, @RequestParam BigDecimal amount) {
        return paymentService.pay(userName, amount);
    }

    @GetMapping
    public ResponseEntity<List<PaymentEntity>> getAllPayments() {
        List<PaymentEntity> payments = paymentService.getAllPayments();
        return ResponseEntity.ok(payments);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Integer id){
        paymentService.deletePayment(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/count")
    // Burdada ("/{count}") yazanda postman niiyese cixartmadi
    public ResponseEntity<Integer> getPaymentsCount(){
        Integer count = paymentService.getAllPayments().size();
        return ResponseEntity.ok(count);
    }
}
