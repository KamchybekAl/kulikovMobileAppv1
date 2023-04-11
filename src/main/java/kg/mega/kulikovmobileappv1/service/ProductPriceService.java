package kg.mega.kulikovmobileappv1.service;

import kg.mega.kulikovmobileappv1.model.Product;
import kg.mega.kulikovmobileappv1.model.ProductPrice;

public interface ProductPriceService {
    ProductPrice saveProductPrice(ProductPrice productPrice);

    ProductPrice updateProductPrice (ProductPrice productPrice);

    ProductPrice findById(Long id);
    ProductPrice findByProduct(Product product);
}
