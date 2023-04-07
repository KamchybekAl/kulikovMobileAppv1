package kg.mega.kulikovmobileappv1.service;

import kg.mega.kulikovmobileappv1.model.Product;

public interface ProductService {
    Product saveProduct (Product product);

    Product updateProduct(Product product);
}
