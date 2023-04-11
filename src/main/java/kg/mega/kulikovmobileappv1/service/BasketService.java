package kg.mega.kulikovmobileappv1.service;

import kg.mega.kulikovmobileappv1.model.Basket;

public interface BasketService {
    Basket saveBasket(Basket basket);

    Basket updateBasket (Basket basket);

    Basket findById(Long id);

}

