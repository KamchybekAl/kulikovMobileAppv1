package kg.mega.kulikovmobileappv1.controller;

import kg.mega.kulikovmobileappv1.model.Order;
import kg.mega.kulikovmobileappv1.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor

public class OrderController {
    private final OrderService orderService;
    @PostMapping("/save")
    public Order save(@RequestBody Order order){
        return orderService.makeOrder(order);
    }

}
