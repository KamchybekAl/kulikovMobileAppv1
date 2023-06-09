package kg.mega.kulikovmobileappv1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_basket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate createdDate;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;
    @OneToOne(mappedBy = "basket")
    private Order order;

    @OneToMany(mappedBy = "basket",cascade = CascadeType.ALL)
    private List<Product>productList;


}
