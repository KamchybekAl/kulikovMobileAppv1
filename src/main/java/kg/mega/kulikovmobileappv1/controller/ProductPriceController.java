package kg.mega.kulikovmobileappv1.controller;
import kg.mega.kulikovmobileappv1.model.ProductPrice;
import kg.mega.kulikovmobileappv1.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/productprice")
@RequiredArgsConstructor
public class ProductPriceController<productPrice> {

    private final ProductPriceService productPriceService;
    @PostMapping("/save")

    public ProductPrice saveProductPrice(@RequestBody ProductPrice productPrice)
    {
        return productPriceService.saveProductPrice(productPrice);
    }

    @PostMapping("/updateProductPrice")
    public ProductPrice update(@RequestBody ProductPrice productPrice) {
        return productPriceService.updateProductPrice(productPrice);
    }

}
