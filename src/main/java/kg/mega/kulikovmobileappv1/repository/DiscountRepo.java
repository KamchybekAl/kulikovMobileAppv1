package kg.mega.kulikovmobileappv1.repository;

import kg.mega.kulikovmobileappv1.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepo extends JpaRepository<Discount,Long> {

}
