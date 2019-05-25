package wzl.ebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wzl.ebook.entity.Order;
import wzl.ebook.service.OrderService;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public List<Order> GetOrder() {
        System.out.println("Searching order list...");
        return orderService.findAllOrder();
    }
}
