package az.rajab.paymentservice3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {
    private Long id;
    private BigDecimal amount;
    private String status;
    private LocalDateTime createdAt;

    private Long userId;
    private String userEmail;
    private String userName;

}
