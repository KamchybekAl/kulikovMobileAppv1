package kg.mega.kulikovmobileappv1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTime;
    private Double totalPrice;
    private Double priceWithDiscount;
    private Double bonusPlus;
    private Double bonusMinus;
    private Boolean isPaid;
    private Double defaultPrice;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "basket_id",referencedColumnName = "id")
    private Basket basket;


}
