package kg.mega.kulikovmobileappv1.service.impl;

import kg.mega.kulikovmobileappv1.model.ProductPrice;
import kg.mega.kulikovmobileappv1.repository.ProductPriceRepo;
import kg.mega.kulikovmobileappv1.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ProductPriceServiceImpl implements ProductPriceService {
    private final ProductPriceRepo productPriceRepo;
    @Override
    public ProductPrice saveProductPrice(ProductPrice productPrice)
    {
        return productPriceRepo.save(productPrice);
    }
}
