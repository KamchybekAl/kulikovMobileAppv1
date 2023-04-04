package kg.mega.kulikovmobileappv1.service.impl;

import kg.mega.kulikovmobileappv1.model.Basket;
import kg.mega.kulikovmobileappv1.repository.BasketRepo;
import kg.mega.kulikovmobileappv1.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor

public class BasketServiceImpl implements BasketService {
    private final BasketRepo basketRepo;
    @Override
    public Basket saveBasket(Basket basket) {
        return basketRepo.save(basket);
    }
}
