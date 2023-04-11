package kg.mega.kulikovmobileappv1.repository;

import kg.mega.kulikovmobileappv1.model.Product;
import kg.mega.kulikovmobileappv1.model.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceRepo extends JpaRepository<ProductPrice,Long> {
    ProductPrice findByProduct(Product product);
}
