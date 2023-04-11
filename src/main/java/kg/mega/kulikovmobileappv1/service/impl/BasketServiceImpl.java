package kg.mega.kulikovmobileappv1.service.impl;

import jakarta.transaction.Transactional;
import kg.mega.kulikovmobileappv1.model.Basket;
import kg.mega.kulikovmobileappv1.repository.BasketRepo;
import kg.mega.kulikovmobileappv1.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Transactional

public class BasketServiceImpl implements BasketService {
    private final BasketRepo basketRepo;
    @Override
    public Basket saveBasket(Basket basket) {
        return basketRepo.save(basket);
    }

    @Override
    public Basket updateBasket(Basket basket) {
        Basket updatedBasket = basketRepo.findById(basket.getId()).get();
        updatedBasket.setStatus(basket.getStatus());
        updatedBasket.setCreatedDate(basket.getCreatedDate());
        return updatedBasket;
    }

    @Override
    public Basket findById(Long id) {
        return basketRepo.findById(id).get();
    }


}
