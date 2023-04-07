package kg.mega.kulikovmobileappv1.repository;

import kg.mega.kulikovmobileappv1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
