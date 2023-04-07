package kg.mega.kulikovmobileappv1.service.impl;

import jakarta.transaction.Transactional;
import kg.mega.kulikovmobileappv1.model.Product;
import kg.mega.kulikovmobileappv1.repository.ProductRepo;
import kg.mega.kulikovmobileappv1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional

public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product updatedProduct = productRepo.findById(product.getId()).get();
        updatedProduct.setName(product.getName());
        updatedProduct.setWeight(product.getWeight());
        updatedProduct.setIs_available(product.getIs_available());
        return updatedProduct;
    }


}
