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
<<<<<<< HEAD
    private String status;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate createdDate;
//    @OneToOne(mappedBy = "basket",cascade = CascadeType.ALL)
//        private User user;
    @OneToMany(cascade = CascadeType.ALL)
//            @JoinColumn(name = "basket_id")
=======
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate createdDate;
    private String status;
//    @OneToOne(mappedBy = "basket",cascade = CascadeType.ALL)
//    private User user;
    @OneToMany(cascade = CascadeType.ALL)
            @JoinColumn(name = "basket_id")
>>>>>>> origin/main
    List<Product>productList;

}
