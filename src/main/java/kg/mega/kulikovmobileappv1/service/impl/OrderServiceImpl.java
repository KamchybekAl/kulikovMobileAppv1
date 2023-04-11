package kg.mega.kulikovmobileappv1.service.impl;

import kg.mega.kulikovmobileappv1.model.Basket;
import kg.mega.kulikovmobileappv1.model.Order;
import kg.mega.kulikovmobileappv1.model.ProductPrice;
import kg.mega.kulikovmobileappv1.repository.OrderRepo;
import kg.mega.kulikovmobileappv1.service.BasketService;
import kg.mega.kulikovmobileappv1.service.DiscountService;
import kg.mega.kulikovmobileappv1.service.OrderService;
import kg.mega.kulikovmobileappv1.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final BasketService basketService;
    private final ProductPriceService productPriceService;
    private final DiscountService discountService;
    private final OrderRepo orderRepo;


    @Override
    public Order makeOrder(Order order) {
        Basket basket = basketService.findById(order.getBasket().getId());
        List<ProductPrice> productPrice = basket.getProductList().stream().map(productPriceService::findByProduct).collect(Collectors.toList());
        order.setTotalPrice(getTotalPrice(productPrice));
        return orderRepo.save(order) ;
    }
    private Double getTotalPrice(List<ProductPrice>productPrices){
        Double totalPrice = 0.0;
        for (ProductPrice p:productPrices){
            totalPrice += p.getPrice();
        }
        return totalPrice;

    }
}
