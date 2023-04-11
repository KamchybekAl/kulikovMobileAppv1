package kg.mega.kulikovmobileappv1.service.impl;

import kg.mega.kulikovmobileappv1.model.Discount;
import kg.mega.kulikovmobileappv1.repository.DiscountRepo;
import kg.mega.kulikovmobileappv1.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class DiscountServiceImpl implements DiscountService {
private final DiscountRepo discountRepo;
    @Override
    public Discount saveDiscount(Discount discount) {

        return discountRepo.save(discount);
    }

    @Override
    public Discount findById(Long id) {
        return discountRepo.findById(id).get();
    }
}
