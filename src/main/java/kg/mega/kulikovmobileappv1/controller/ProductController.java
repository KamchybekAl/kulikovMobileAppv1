package kg.mega.kulikovmobileappv1.controller;

import kg.mega.kulikovmobileappv1.model.Product;
import kg.mega.kulikovmobileappv1.service.ProductService;
import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> origin/main

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping("/save")

<<<<<<< HEAD
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/updateProduct")
    public Product update(@RequestBody Product product){
        return productService.updateProduct(product);
    }

=======
    public Product saveProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }

>>>>>>> origin/main
}
