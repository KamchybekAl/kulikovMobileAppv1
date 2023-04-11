package kg.mega.kulikovmobileappv1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "basket_id",referencedColumnName = "id")
//    private Basket basket;

    @OneToOne(mappedBy = "user")
    private Basket basket;


}
