package kg.mega.kulikovmobileappv1.controller;

import kg.mega.kulikovmobileappv1.model.Basket;
import kg.mega.kulikovmobileappv1.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/basket")
@RequiredArgsConstructor
public class BasketController {
    private final BasketService basketService;
    @PostMapping("/save")

    public Basket saveBasket(@RequestBody Basket basket){
        return basketService.saveBasket(basket);
    }
    @PostMapping("/updateBasket")
    public Basket update(@RequestBody Basket basket){
        return basketService.updateBasket(basket);
    }
}
