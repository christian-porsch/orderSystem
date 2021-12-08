package orderSystem.repository;

import orderSystem.model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OrderRepo {

    private Map<String, Order> orders = new HashMap<>();

    public Map<String, Order> listAllOrders(){
        return orders;
    }

    public Optional<Order> findOrderById(String id){
        return Optional.ofNullable(orders.get(id));
    }

    public void addOrder(Order newOrder){
        orders.put(newOrder.getId(), newOrder);
    }


}
