package orderSystem.service;

import orderSystem.model.Product;
import orderSystem.repository.ProductRepo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class OrderServiceTest {


    void getProduct() {
    }

    @Test
    public void listAllProducts() {

        // Given

        ProductRepo testProductRepo = new ProductRepo(List.of(
                new Product("1", "MacBook Pro"),
                new Product("2", "Lenovo IdeaPad"),
                new Product("3", "Logitech G502 Hero")
        ));

        // When

        List<Product> actualListOfProducts = testProductRepo.listAllProducts();

        // Then

        assertThat(actualListOfProducts, hasSize(3));
        assertThat(actualListOfProducts, containsInAnyOrder(
                new Product("1", "MacBook Pro"),
                new Product("2", "Lenovo IdeaPad"),
                new Product("3", "Logitech G502 Hero")
        ));
    }


    void addOrder() {
    }


    void getOrder() {
    }


    void listAllOrders() {
    }
}