package kg.mega.kulikovmobileappv1.service;

import kg.mega.kulikovmobileappv1.model.Discount;

public interface DiscountService {
    Discount saveDiscount(Discount discount);
    Discount findById(Long id);
}

