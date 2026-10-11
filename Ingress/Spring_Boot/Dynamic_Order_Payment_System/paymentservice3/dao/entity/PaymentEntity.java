package az.rajab.paymentservice3.dao.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    private String status;

    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;
}
