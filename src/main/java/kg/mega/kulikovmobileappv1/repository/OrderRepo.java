package kg.mega.kulikovmobileappv1.repository;

import kg.mega.kulikovmobileappv1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
