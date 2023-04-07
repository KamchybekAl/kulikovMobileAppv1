package kg.mega.kulikovmobileappv1.repository;

import kg.mega.kulikovmobileappv1.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepo extends JpaRepository<Basket,Long> {
}
