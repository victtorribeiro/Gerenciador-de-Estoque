package github.victtorribeiro.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table ( name = "produto")
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    @Enumerated(value = EnumType.STRING)
    private String type;

    @Column
    private String description;

    @Column(name = "unitary_value")
    private String unitaryValue;

    @Column
    private Integer amount;

    @Column(name = "registration_date")
    private LocalDate registrationDate;



}
