package kg.mega.kulikovmobileappv1.service.impl;

import jakarta.transaction.Transactional;
import kg.mega.kulikovmobileappv1.model.ProductPrice;
import kg.mega.kulikovmobileappv1.repository.ProductPriceRepo;
import kg.mega.kulikovmobileappv1.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional

public class ProductPriceServiceImpl implements ProductPriceService {
    private final ProductPriceRepo productPriceRepo;
    @Override
    public ProductPrice saveProductPrice(ProductPrice productPrice)
    {
        return productPriceRepo.save(productPrice);
    }

    @Override
    public ProductPrice updateProductPrice(ProductPrice productPrice) {
        ProductPrice updatedProductPrice = productPriceRepo.findById(productPrice.getId()).get();
        updatedProductPrice.setPrice(productPrice.getPrice());
        updatedProductPrice.setStartDate(productPrice.getStartDate());
        updatedProductPrice.setEndDate(productPrice.getEndDate());

        return updatedProductPrice;
    }
}
