package kg.mega.kulikovmobileappv1.service.impl;

import kg.mega.kulikovmobileappv1.model.Product;
import kg.mega.kulikovmobileappv1.repository.ProductRepo;
import kg.mega.kulikovmobileappv1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }
}
