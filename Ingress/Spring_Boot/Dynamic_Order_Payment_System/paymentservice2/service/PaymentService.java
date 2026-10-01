package az.rajab.paymentservice2.service;

import az.rajab.paymentservice2.dao.entity.PaymentEntity;
import az.rajab.paymentservice2.dao.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public String pay(String userName, BigDecimal amount) {
        PaymentEntity entity = new PaymentEntity();

        entity.setName(userName);
        entity.setAmount(amount);

        paymentRepository.save(entity);
        return "Successful Payment";
    }

    public List<PaymentEntity> getAllPayments() {
        return paymentRepository.findAll();
    }

    public void deletePayment(Integer id) {
        paymentRepository.deleteById(String.valueOf(id));
    }

    public Long getPaymentsCount() {
        return paymentRepository.count();
        // Integer yazmisdim amma goturmedi solve edende Long yazdi ona tab etdim
    }
}
