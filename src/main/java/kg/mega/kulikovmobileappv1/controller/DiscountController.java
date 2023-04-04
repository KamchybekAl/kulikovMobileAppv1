package kg.mega.kulikovmobileappv1.controller;

import kg.mega.kulikovmobileappv1.model.Discount;
import kg.mega.kulikovmobileappv1.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/discount")
@RequiredArgsConstructor
public class DiscountController {
    private final DiscountService discountService;

    @PostMapping("/save")
    public Discount saveDiscount(@RequestBody Discount discount){
        return discountService.saveDiscount(discount);
    }
}
