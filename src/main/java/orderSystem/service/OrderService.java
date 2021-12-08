package orderSystem.service;

import orderSystem.model.Order;
import orderSystem.model.Product;
import orderSystem.repository.OrderRepo;
import orderSystem.repository.ProductRepo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OrderService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public OrderService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Optional<Product> getProduct(String id){
        return productRepo.getProductById(id);
    }

    public List<Product> listAllProducts(){
        return productRepo.listAllProducts();
    }

    public void addOrder(Order newOrder){
        orderRepo.addOrder(newOrder);
    }

    public Optional<Order> getOrder(String id){
        return orderRepo.findOrderById(id);
    }

    public Map<String, Order> listAllOrders(){
        return orderRepo.listAllOrders();
    }
}
