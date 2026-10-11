package az.rajab.paymentservice3.service;

import az.rajab.paymentservice3.dao.entity.PaymentEntity;
import az.rajab.paymentservice3.dao.repository.PaymentRepository;
import az.rajab.paymentservice3.dao.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;

    public PaymentService(PaymentRepository paymentRepository, UserRepository userRepository) {
        this.paymentRepository = paymentRepository;
        this.userRepository = userRepository;
    }

    public void deletePayment(Long id) {
        PaymentEntity payment = paymentRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Payment not found"));


        String status;
        if(payment.getStatus() != null){
            status = payment.getStatus().toString();
        }else{
            status = "";
        }
        if ("SUCCESS".equals(status) || "CANCELLED".equals(status)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Payment with a status of SUCCESS or CANCELLED cannot be deleted.");
        }

        paymentRepository.delete(payment);
    }

    public BigDecimal getTotalSuccessPayments(Long userId) {
        boolean userExists = userRepository.existsById(userId);
        if (!userExists) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }

        List<PaymentEntity> allPayments = paymentRepository.findAll();

        return allPayments.stream()
                .filter(payment -> payment.getUser() != null && payment.getUser().getId().equals(userId))
                .filter(payment -> payment.getStatus() != null && "SUCCESS".equals(payment.getStatus().toString()))
                .map(PaymentEntity::getAmount)
                .filter(amount -> amount != null)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
