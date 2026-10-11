package az.rajab.paymentservice3.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private String status;

}
